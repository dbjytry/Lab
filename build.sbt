name := "lab"
version := "0.1"
scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.3.1",
  "com.databricks" % "dbutils-api_2.11" % "0.0.3"
)
