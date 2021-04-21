lazy val app = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.0"
)

val someVersion = "2.3.10"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % someVersion,
  "com.typesafe.play" %% "play-test" % someVersion,
  "com.typesafe.play" %% "play-docs" % someVersion
)
