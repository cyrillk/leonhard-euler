name := "Leonhard Euler"

organization := "net.projecteuler"

version := "0.0.1"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.3" % "test" withSources() withJavadoc(),
  "org.mockito" % "mockito-core" % "1.10.19" % "test" withSources() withJavadoc()
)

initialCommands := "import net.projecteuler._"

