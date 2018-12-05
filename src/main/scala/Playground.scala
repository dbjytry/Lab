import com.databricks.dbutils_v1.DBUtilsHolder.dbutils
import org.apache.spark.sql.SparkSession

object Playground extends App {
  val spark: SparkSession = SparkSession.builder().getOrCreate()

  dbutils.secrets.get(scope = "foo", key = "bar")

  //dbutils.notebook.exit("baz")
}
