name := "cats"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(

  "org.typelevel" %% "cats-core" % "2.0.0-M1",

  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
)