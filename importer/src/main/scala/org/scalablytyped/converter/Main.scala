package org.scalablytyped.converter

import org.scalablytyped.converter.internal.constants.defaultCacheFolder
import org.scalablytyped.converter.internal.importer.{withZipFs, Ci}
import org.scalablytyped.converter.internal.{constants, files}

object Main {
  def main(args: Array[String]): Unit = {
    val Ci.Config(config) = args
    /* I havent found a way to configure bloop to customize the global ExecutionContext, so this is it */
    System.setProperty("scala.concurrent.context.numThreads", config.parallelScalas.toString)

    val publishFolder = constants.defaultLocalPublishFolder

    withZipFs(files.existing(defaultCacheFolder) / "bintray.zip") { bintrayPath =>
      withZipFs(defaultCacheFolder / "npmjs.zip") { npmjsPath =>
        withZipFs.maybe(defaultCacheFolder / "parseCache.zip", config.enableParseCache) { parseCachePathOpt =>
          val paths = Ci.Paths(bintrayPath, npmjsPath, parseCachePathOpt, defaultCacheFolder, publishFolder)
          new Ci(config, paths).run()
        }
      }
    }

    System.exit(0)
  }
}
