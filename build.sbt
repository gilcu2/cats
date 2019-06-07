name := "cats"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions += "-Ypartial-unification"

val catsVersion = "2.0.0-M1"

libraryDependencies ++= Seq(

  "org.typelevel" %% "cats-core" % catsVersion,

  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.typelevel" %% "cats-testkit" % catsVersion % Test,
)