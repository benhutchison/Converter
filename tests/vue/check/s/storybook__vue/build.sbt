organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-fa1b53"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "0.0-unknown-a12e5c",
  "org.scalablytyped" %%% "vue" % "2.5.13-d572e6",
  "org.scalablytyped" %%% "webpack-env" % "1.13-daf250")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
