name := "Leonhard Euler"

organization := "net.projecteuler"

version := "0.0.1"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.mockito" % "mockito-core" % "1.10.19" withSources() withJavadoc()
)

initialCommands := "import net.projecteuler.leonhardeuler._"

