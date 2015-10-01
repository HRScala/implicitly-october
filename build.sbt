organization := "org.hrscala"
name := "implicitly-october"
version := "0.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
)

/* compile options */
scalaVersion := "2.11.7"
scalacOptions := Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:_",
  "-optimise",
  "-unchecked",
  "-Xcheckinit",
  "-Xlint",
  "-Xmax-classfile-name", "72",
  "-Xno-forwarders",
  "-Xverify",
  "-Yclosure-elim",
  "-Yconst-opt",
  "-Ydead-code",
  "-Yinline",
  "-Yrepl-sync",
  "-Ywarn-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-inaccessible",
  "-Ywarn-infer-any",
  "-Ywarn-nullary-override",
  "-Ywarn-nullary-unit",
  "-Ywarn-numeric-widen"
)
