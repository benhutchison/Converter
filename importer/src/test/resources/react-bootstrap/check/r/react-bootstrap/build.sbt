organization := "com.olvind.scalablytyped"
name := "react-bootstrap"
version := "0.32-358393"
scalaVersion := "2.12.6"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.olvind.scalablytyped" %%% "react" % "0.0-unknown-07ab7e",
  "com.olvind.scalablytyped" %%% "std" % "0.0-unknown-a1fea8",
  "org.scala-js" %%% "scalajs-dom" % "0.9.5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
        