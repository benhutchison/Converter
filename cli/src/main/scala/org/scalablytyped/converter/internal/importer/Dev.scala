package org.scalablytyped.converter.internal.importer

import java.util.concurrent.ForkJoinPool

import com.olvind.logging
import com.olvind.logging.{LogLevel, Logger}
import org.scalablytyped.converter.internal.importer.build.{BloopCompiler, PublishedSbtProject}
import org.scalablytyped.converter.internal.importer.documentation.Npmjs
import org.scalablytyped.converter.internal.importer.jsonCodecs._
import org.scalablytyped.converter.internal.phases.{PhaseListener, PhaseRes, PhaseRunner, RecPhase}
import org.scalablytyped.converter.internal.scalajs.{Name, Versions}
import org.scalablytyped.converter.internal.ts.CalculateLibraryVersion.PackageJsonOnly
import org.scalablytyped.converter.internal.ts.{PackageJsonDeps, TsIdentLibrary}
import org.scalablytyped.converter.internal.{IArray, InFolder, Json, constants, files, scalajs}
import org.scalablytyped.converter.{Flavour, Selection}

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}

object Dev {
  case class CmdLine(
      useScalaJsDomTypes:   Boolean        = true,
      flavour:              Flavour        = Flavour.Normal,
      outputPackage:        scalajs.Name   = scalajs.Name.typings,
      enableScalaJsDefined: Boolean        = true,
      stdLibs:              IArray[String] = IArray("es6"),
      ignore:               IArray[String] = IArray.Empty,
      scalaVersion:         String         = Versions.Scala213.scalaVersion,
      scalaJsVersion:       String         = Versions.ScalaJs1.scalaJsVersion,
      publishLocalTo:       os.Path        = constants.defaultLocalPublishFolder,
  )

  object paths {
    val publishLocalFolder = constants.defaultLocalPublishFolder
    val parseCache         = files.existing(constants.defaultCacheFolder / 'parse)
    val out                = files.existing(os.pwd / 'out)
    val node_modules       = files.existing(os.pwd / 'node_modules)
    val packageJson        = files.existing(os.pwd / "package.json")
  }

  val parseCache = Some(paths.parseCache.toNIO)
  val pool       = new ForkJoinPool(20)
  val ec         = ExecutionContext.fromExecutorService(pool)

  val t0          = System.currentTimeMillis
  val flavour     = Flavour.Normal
  val projectName = "ScalablyTyped"

  val logger: Logger[(Array[Logger.Stored], Unit)] =
    logging.storing() zipWith logging.stdout.filter(LogLevel.warn)

  import scopt.OParser
  val builder = OParser.builder[ConversionOptions]
  val parser1 = {
    import builder._
    OParser.sequence(
      programName("stc"),
      head("stc"),
      // option -f, --foo
      opt[Boolean]("useScalaJsDomTypes")
        .action((x, c) => c.copy(useScalaJsDomTypes = x))
        .text("foo is an integer property"),
      // more options here...
    )
  }
  def main(args: Array[String]): Unit = {
    require(
      os.exists(paths.packageJson) && os.exists(paths.node_modules),
      "Must run in a directory with package.json and node_modules",
    )
    require(os.exists(paths.node_modules / "typescript" / "lib"), "must install typescript")
    require(args.nonEmpty, "Must supply names of libraries, possibly with an / for versions")

    val packageJson = Json.force[PackageJsonDeps](paths.packageJson)
    val wantedLibs  = packageJson.allLibs.map(TsIdentLibrary.apply)
    require(wantedLibs.nonEmpty, "No libraries found in package.json")

    val shared = ConversionOptions(
      useScalaJsDomTypes = false,
      outputPackage            = Name.typings,
      enableScalaJsDefined     = Selection.AllExcept(Libraries.Slow.to[Seq]: _*),
      flavour                  = flavour,
      ignoredLibs              = Set(),
      ignoredModulePrefixes    = Set(),
      stdLibs                  = IArray("es6"),
      expandTypeMappings       = EnabledTypeMappingExpansion.DefaultSelection,
      versions                 = Versions(Versions.Scala213, Versions.ScalaJs1),
      organization = "org.scalablytyped"
    )

    val compilerF: Future[BloopCompiler] =
      BloopCompiler(logger.filter(LogLevel.debug).void, shared.versions, failureCacheFolderOpt = None)(ec)

    val compiler = Await.result(compilerF, Duration.Inf)

    val Source.FromNodeModules(sources, folders, libraryResolver, stdLibSource) =
      Source.fromNodeModules(InFolder(paths.node_modules), shared, wantedLibs)

    val Pipeline: RecPhase[Source, PublishedSbtProject] =
      RecPhase[Source]
        .next(
          new Phase1ReadTypescript(
            calculateLibraryVersion = PackageJsonOnly,
            resolve                 = libraryResolver,
            ignored                 = shared.ignoredLibs,
            ignoredModulePrefixes   = shared.ignoredModulePrefixes,
            stdlibSource            = stdLibSource,
            pedantic                = false,
            parser                  = PersistingParser(parseCache, folders, logger.void),
            expandTypeMappings      = shared.expandTypeMappings,
          ),
          "typescript",
        )
        .next(
          new Phase2ToScalaJs(
            pedantic             = false,
            enableScalaJsDefined = shared.enableScalaJsDefined,
            outputPkg            = shared.outputPackage,
          ),
          "scala.js",
        )
        .next(new PhaseFlavour(flavourImpl.fromInput(shared)), flavour.toString)
        .next(
          new Phase3Compile(
            resolve                    = libraryResolver,
            versions                   = shared.versions,
            compiler                   = compiler,
            targetFolder               = paths.out,
            projectName                = projectName,
            organization               = shared.organization,
            resolverRefOpt             = None,
            publishLocalFolder         = paths.publishLocalFolder,
            metadataFetcher            = Npmjs.No,
            softWrites                 = true,
            flavour                    = flavourImpl.fromInput(shared),
            generateScalaJsBundlerFile = false,
            ensureSourceFilesWritten   = true,
          ),
          "build",
        )

    val results: Map[Source, PhaseRes[Source, PublishedSbtProject]] =
      sources.toVector
        .map(source =>
          source -> PhaseRunner.go(Pipeline, source, Nil, (_: Source) => logger.void, PhaseListener.NoListener),
        )
        .toMap

    val successes: Map[Source, PublishedSbtProject] = {
      def go(source: Source, p: PublishedSbtProject): Map[Source, PublishedSbtProject] =
        Map(source -> p) ++ p.project.deps.flatMap { case (k, v) => go(k, v) }

      results.collect { case (s, PhaseRes.Ok(res)) => go(s, res) }.reduceOption(_ ++ _).getOrElse(Map.empty)
    }

    val failures: Map[Source, Either[Throwable, String]] =
      results.collect { case (_, PhaseRes.Failure(errors)) => errors }.reduceOption(_ ++ _).getOrElse(Map.empty)

    println(s"Successes: ${successes.keys.map(_.libName.value).mkString(", ")}")
    println(s"Failures: ${failures.keys.map(_.libName.value).mkString(", ")}")

    val td = System.currentTimeMillis - t0
    logger warn td
    pool.shutdown()
  }
}
