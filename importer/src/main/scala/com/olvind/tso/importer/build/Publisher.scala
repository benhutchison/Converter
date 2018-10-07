package com.olvind.tso
package importer.build

import java.io._
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.jar.{JarEntry, JarOutputStream, Manifest}

import ammonite.ops.{ls, read, Path, RelPath}
import com.olvind.tso.scalajs.SbtProject

import scala.collection.mutable
import scala.xml.Elem

object Publisher {
  import versions._

  class IvyLayoutFiles(p: SbtProject) {
    private val libraryPath = RelPath(p.organization) / p.artifactId / p.version
    val jarFile             = OutRelFile(libraryPath / 'jars / s"${p.artifactId}.jar")
    val sourceFile          = OutRelFile(libraryPath / 'srcs / s"${p.artifactId}-sources.jar")
    val ivyFile             = OutRelFile(libraryPath / 'ivys / "ivy.xml")
    val pomFile             = OutRelFile(libraryPath / 'poms / s"${p.artifactId}.pom")

    val all = Seq(jarFile, sourceFile, ivyFile, pomFile)
  }

  def ivyLayout(layout:      IvyLayoutFiles,
                paths:       ProjectPaths,
                p:           SbtProject,
                publication: ZonedDateTime,
                sourceFiles: OutRelFiles): OutRelFiles =
    OutRelFiles(
      Map(
        layout.jarFile -> createJar(paths.classesDir),
        layout.sourceFile -> createJar(sourceFiles, publication),
        layout.ivyFile -> fromXml(ivy(p, publication)),
        layout.pomFile -> fromXml(pom(p))
      )
    )

  private def fromXml(xml: Elem): Array[Byte] = {
    val prelude: String = """<?xml version="1.0" encoding="UTF-8"?>"""
    (prelude + xml).getBytes(constants.Utf8)
  }

  private def createManifest(): Manifest = {
    val m = new java.util.jar.Manifest()
    m.getMainAttributes.put(java.util.jar.Attributes.Name.MANIFEST_VERSION, "1.0")
    m.getMainAttributes.putValue("Created-By", "Tso")
    m
  }

  // adapted from mill
  private def createJar(fromFolder: Path): Array[Byte] = {
    val seen = mutable.Set[RelPath](RelPath("META-INF") / "MANIFEST.MF")
    val baos = new ByteArrayOutputStream(1024 * 1024)
    val jar  = new JarOutputStream(baos, createManifest())

    try {
      ls.rec(fromFolder).filter(_.isFile).foreach { file =>
        val mapping = file.relativeTo(fromFolder)
        if (!seen(mapping)) {
          seen.add(mapping)
          val entry = new JarEntry(mapping.toString)
          entry.setTime(file.mtime.toMillis)
          jar.putNextEntry(entry)
          jar.write(read.bytes(file))
          jar.closeEntry()
        }
      }
    } finally jar.close()

    baos.toByteArray
  }

  private def createJar(sourceFiles: OutRelFiles, publication: ZonedDateTime): Array[Byte] = {
    val baos = new ByteArrayOutputStream(1024 * 1024)
    val jar  = new JarOutputStream(baos, createManifest())

    try {
      sourceFiles.files.foreach {
        case (relFile, contents) =>
          val entry = new JarEntry(relFile.file.toString)
          entry.setTime(publication.toEpochSecond)
          jar.putNextEntry(entry)
          jar.write(contents)
          jar.closeEntry()
      }
    } finally jar.close()

    baos.toByteArray
  }

  def ivy(p: SbtProject, publication: ZonedDateTime) =
    <ivy-module version="2.0" xmlns:e="http://ant.apache.org/ivy/extra">
      <info organisation={p.organization}
            module={p.artifactId}
            revision={p.version}
            status="release"
            publication={publication.format(DateTimeFormatter.ofPattern("ddMMyyyyhhmmss"))}>
        <description>
          react
        </description>
      </info>
      <configurations>
        <conf name="compile" visibility="public" description=""/>
        <conf name="runtime" visibility="public" description="" extends="compile"/>
        <conf name="test" visibility="public" description="" extends="runtime"/>
        <conf name="provided" visibility="public" description=""/>
        <conf name="optional" visibility="public" description=""/>
        <conf name="compile-internal" visibility="private" description="" extends="compile,optional,provided"/>
        <conf name="runtime-internal" visibility="private" description="" extends="runtime,optional"/>
        <conf name="test-internal" visibility="private" description="" extends="test,optional,provided"/>
        <conf name="plugin" visibility="private" description=""/>
        <conf name="pom" visibility="public" description=""/>
        <conf name="scala-tool" visibility="private" description=""/>
      </configurations>
      <publications>
        <artifact name={p.artifactId} type="pom" ext="pom" conf="pom"/>
        <artifact name={p.artifactId} type="jar" ext="jar" conf="compile"/>
        <artifact name={p.artifactId} type="src" ext="jar" conf="compile" e:classifier="sources"/>
      </publications>
      <dependencies>
        <dependency org={scalaOrganization} name="scala-compiler" rev={scalaVersion} conf="scala-tool->default,optional(default)"/>
        <dependency org={scalaOrganization} name="scala-library" rev={scalaVersion} conf="scala-tool->default,optional(default);compile->default(compile)"/>
        <dependency org={scalaJsOrganization} name={s"scalajs-compiler_$scalaVersion"} rev={scalaJsVersion} conf="plugin->default(compile)"/>
        <dependency org={scalaJsOrganization} name={s("scalajs-library")} rev={scalaJsVersion} conf="compile->default(compile)"/>
        <dependency org={scalaJsOrganization} name={s("scalajs-test-interface")} rev={scalaJsVersion} conf="test->default(compile)"/>
        <dependency org={scalaJsOrganization} name={sjs("scalajs-dom")} rev={scalaJsDomVersion} conf="compile->default(compile)"/>
        <dependency org={constants.organization} name={sjs("runtime")} rev={scalablyTypedRuntimeVersion} conf="compile->default(compile)"/>
        {p.deps.map(d =>
          <dependency org={d.project.organization} name={d.project.artifactId} rev={d.project.version} conf="compile->default(compile)"/>
      )}
      </dependencies>
    </ivy-module>

  def pom(p: SbtProject): Elem =
    <project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://maven.apache.org/POM/4.0.0">
      <modelVersion>4.0.0</modelVersion>
      <groupId>{p.organization}</groupId>
      <artifactId>{p.artifactId}</artifactId>
      <packaging>jar</packaging>
      <description>{p.name}</description>
      <version>{p.version}</version>
      <name>{p.name}</name>
      <organization>
        <name>{p.organization}</name>
      </organization>
      <dependencies>
        <dependency>
          <groupId>{scalaOrganization}</groupId>
          <artifactId>scala-library</artifactId>
          <version>{scalaVersion}</version>
        </dependency>
        <dependency>
          <groupId>{scalaJsOrganization}</groupId>
          <artifactId>{s("scalajs-library")}</artifactId>
          <version>{scalaJsVersion}</version>
        </dependency>
        <dependency>
          <groupId>{scalaJsOrganization}</groupId>
          <artifactId>{s("scalajs-test-interface")}</artifactId>
          <version>{scalaJsVersion}</version>
          <scope>test</scope>
        </dependency>
        <dependency>
          <groupId>{scalaJsOrganization}</groupId>
          <artifactId>{sjs("scalajs-dom")}</artifactId>
          <version>{scalaJsDomVersion}</version>
        </dependency>
        <dependency>
          <groupId>com.olvind</groupId>
          <artifactId>{sjs("runtime")}</artifactId>
          <version>{scalablyTypedRuntimeVersion}</version>
        </dependency>
        {p.deps.map(d =>
        <dependency>
          <groupId>{d.project.organization}</groupId>
          <artifactId>{d.project.artifactId}</artifactId>
          <version>{d.project.version}</version>
        </dependency>
      )}
      </dependencies>
    </project>
}