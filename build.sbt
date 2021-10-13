ThisBuild / organization      := "civilizeddev.github.io"
ThisBuild / organizationName  := "David Lee"
ThisBuild / scalaVersion      := "3.0.2"
ThisBuild / scalafixOnCompile := true
ThisBuild / javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

ThisBuild / dockerRepository := Some("ghcr.io/civilizeddev")
ThisBuild / publishTo        := Some("github-maven".at("https://maven.pkg.github.com/civilizeddev/scala3-template"))

name             := "scala3-template"
Docker / version := "latest"

libraryDependencies += "ch.qos.logback"            % "logback-classic" % "1.2.6"
libraryDependencies += "org.typelevel"            %% "cats-core"       % "2.6.1"
libraryDependencies += "com.softwaremill.macwire" %% "macros"          % "2.4.2"  % Provided
libraryDependencies += "com.softwaremill.macwire" %% "util"            % "2.4.2"
libraryDependencies += "com.softwaremill.macwire" %% "proxy"           % "2.4.2"
libraryDependencies += "org.scalameta"            %% "munit"           % "0.7.29" % Test

enablePlugins(GitVersioning, GraalVMNativeImagePlugin, DockerPlugin)
dockerExposedPorts := Seq(9000)

dockerLabels ++= Map("org.opencontainers.image.source" -> "https://github.com/civilizeddev/scala3-template")
