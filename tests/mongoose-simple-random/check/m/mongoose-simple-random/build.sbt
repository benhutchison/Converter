organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-a83cd5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-382d38",
  "org.scalablytyped" %%% "node" % "0.0-unknown-b8707e",
  "org.scalablytyped" %%% "std" % "0.0-unknown-c06e81")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
