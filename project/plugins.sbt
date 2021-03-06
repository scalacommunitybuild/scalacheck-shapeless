plugins_(
  "com.geirsson"       % "sbt-ci-release"           % "1.5.3",
  "com.typesafe"       % "sbt-mima-plugin"          % "0.7.0",
  "org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0"
)

def plugins_(modules: ModuleID*) = modules.map(addSbtPlugin)

val scalaJsVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJsVersion)
