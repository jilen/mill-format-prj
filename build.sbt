(ThisBuild / scalaVersion) := "2.13.8"
(ThisBuild / version) := "0.0.1-SNAPSHOT"

lazy val app = project.in(file("app")).settings(
  libraryDependencies ++= Seq(
    "io.getquill" %% "quill-sql" % "3.18.0"
  )
)

lazy val root = project.in(file(".")).aggregate(app).dependsOn(app)
