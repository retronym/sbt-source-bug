import sbt._
import Keys._

object build extends Build {
  lazy val analytics = Project(
    id        = "root",
    base      = file("."),
    settings  = Defaults.defaultSettings,
    aggregate = Seq[ProjectReference](p1, p2)
  )

  lazy val p1 = Project(
    id        = "p1",
    base      = file("p1"),
    settings  = Defaults.defaultSettings
  )

  lazy val p2 = Project(
    id        = "p2",
    base      = file("p2"),
    settings  = Defaults.defaultSettings,
    dependencies = Seq(p1)
  )
}
