name := """test"""
organization := "TEST"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies ++= Seq(
  javaJdbc
)

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "8.0.15"
)
