ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.1"
ThisBuild / organization     := "org.pantalasa"

ThisBuild / crossScalaVersions := Seq("2.13.12", "3.3.1")

lazy val root = (project in file("."))
  .settings(
    name := "scala-service",
    libraryDependencies ++= Seq(
      "org.apache.spark"   %% "spark-core"      % "3.5.0",
      "org.typelevel"      %% "cats-core"       % "2.10.0",
      "com.typesafe.akka"  %% "akka-actor-typed" % "2.8.5",
      "org.scalatest"      %% "scalatest"       % "3.2.18" % Test,
      "org.scalameta"      %% "munit"           % "1.0.0"  % Test,
    ),
  )
