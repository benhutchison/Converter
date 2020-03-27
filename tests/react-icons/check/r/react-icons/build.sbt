organization := "org.scalablytyped"
name := "react-icons"
version := "2.2-708183"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "react" % "0.0-unknown-3c44c4",
  "org.scalablytyped" %%% "react-icon-base" % "2.1-bfef7a",
  "org.scalablytyped" %%% "std" % "0.0-unknown-ed258f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
