name := "akka-http-scala"

version := "1.0"

scalaVersion := "2.12.1"
val circeVersion = "0.8.0"
lazy val circeCore          = "io.circe"                %   "circe-core_2.12"       % circeVersion
lazy val circeParser        = "io.circe"                %%  "circe-parser"          % circeVersion
lazy val circeGeneric       = "io.circe"                %%  "circe-generic"         % circeVersion

libraryDependencies ++= Seq(
         "com.typesafe.akka" %% "akka-http" %"10.0.7",
          circeCore,
          circeParser,
          circeGeneric
 )
