resolvers += {
  "local-maven" at "file://"+sys.props("user.home")+"/.m2/repository"
}

scalaVersion := "2.10.0-RC1"

libraryDependencies <+= scalaVersion apply { sv =>
  "org.scala-lang" % "scala-library-all" % sv
}


