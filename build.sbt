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



//#enable-plugin
lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)

//#enable-plugin

//#play-ebean-models
playEbeanModels in Compile := Seq("models.*")
//#play-ebean-models

//#play-ebean-debug
playEbeanDebugLevel := 4
//#play-ebean-debug

//#play-ebean-agent-args
playEbeanAgentArgs += ("detect" -> "false")
//#play-ebean-agent-args

//#play-ebean-test
inConfig(Test)(PlayEbean.scopedSettings)

playEbeanModels in Test := Seq("models.*")
