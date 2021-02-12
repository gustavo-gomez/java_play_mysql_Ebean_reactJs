name := """ingeniaappsweb"""
organization := "Ingenia Apps"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies ++= Seq(
  javaJdbc
)

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "8.0.15"
//  "mysql" % "mysql-connector-java" % "5.1.41"
)
