name := "pathfinder"

version := "0.1"

scalaVersion := "2.13.0"

lazy val pathfinder = (project in file("."))
  .settings(
    name := "pathfinder",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )


