ThisBuild / organization      := "civilizeddev.github.io"
ThisBuild / organizationName  := "David Lee"
ThisBuild / scalaVersion      := "3.1.0"
ThisBuild / scalafixOnCompile := true
ThisBuild / javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

ThisBuild / dockerRepository := Some("ghcr.io/civilizeddev")
ThisBuild / publishTo        := Some("github-maven".at("https://maven.pkg.github.com/civilizeddev/scala3-template"))

name             := "scala3-template"
Docker / version := "latest"

libraryDependencies += "ch.qos.logback"            % "logback-classic"     % "1.2.6"
libraryDependencies += "org.typelevel"            %% "cats-core"           % "2.6.1"
libraryDependencies += "org.typelevel"            %% "cats-effect"         % "3.2.9"
libraryDependencies += "com.softwaremill.macwire" %% "macros"              % "2.5.0"    % Provided
libraryDependencies += "com.softwaremill.macwire" %% "util"                % "2.5.0"
libraryDependencies += "com.softwaremill.macwire" %% "proxy"               % "2.5.0"
libraryDependencies += "org.scalameta"            %% "munit"               % "1.0.0-M1" % Test
libraryDependencies += "org.typelevel"            %% "munit-cats-effect-3" % "1.0.6"    % Test

enablePlugins(GitVersioning, GraalVMNativeImagePlugin, DockerPlugin)
dockerExposedPorts := Seq(9000)

dockerLabels ++= Map("org.opencontainers.image.source" -> "https://github.com/civilizeddev/scala3-template")
