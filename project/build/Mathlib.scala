import sbt._

class Mathlib(info: ProjectInfo) extends DefaultProject(info) {
  // Lets us get snapshot releases from ScalaTools
  val scalaToolsSnapshots = ScalaToolsSnapshots

  // Declare our dependencies
  val scalatest = "org.scalatest" % "scalatest" % "1.2.1-SNAPSHOT" % "test"
  val scalacheck = "org.scala-tools.testing" %% "scalacheck" % "1.7" % "test"

  // Turn on pretty colors in ScalaTest
  override def testOptions = super.testOptions ++ Seq(TestArgument(TestFrameworks.ScalaTest, "-oD"))
}
