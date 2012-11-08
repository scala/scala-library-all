resolvers += {
  "local-maven" at "file://"+sys.props("user.home")+"/.m2/repository"
}

resolvers += "sonatype-releases" at "http://oss.sonatype.org/content/repositories/releases"

scalaVersion := "2.10.0-RC2"

libraryDependencies <+= scalaVersion apply { sv =>
  "org.scala-lang" % "scala-library-all" % sv
}


