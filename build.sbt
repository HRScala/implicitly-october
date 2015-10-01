organization := "org.hrscala"
name := "implicitly-october"
version := "0.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.propensive" %% "rapture-json-jackson" % "1.1.0"
, "com.github.nscala-time" %% "nscala-time" % "2.2.0"
, "com.typesafe.akka" %% "akka-actor" % "2.4.0"
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
