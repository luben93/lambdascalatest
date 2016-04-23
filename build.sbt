javacOptions ++= Seq("-source","1.8", "-target", "1.8","-Xlint")

lazy val root = (project in file(".")).
settings(
name := "lambdascalatest",
version := "1.0",
scalaVersion := "2.11.8"
retrieveManaged := true,
libraryDependecies += "com.amazonaws" % "aws-lambda-java-core" % "1.0.0"
libraryDependecies += "com.amazonaws" % "aws-lambda-java-events" % "1.0.0"
        )

        mergeStrategy in assembly < 
{
case PathList("META-INF", xs @ _*)=> MergeStrategy.discard
case x => MergeStrategy.first
}
}
