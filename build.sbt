import versions._

ThisBuild / organization := "com.gogs"
ThisBuild / name         := "gogs"
ThisBuild / scalaVersion := "3.5.1"
ThisBuild / version      := "0.1.0"

ThisBuild / usePipelining := true

scalacOptions ++= Seq(
  "-new-syntax",
  // "-no-indent",
  "-Wvalue-discard",
  "-Wunused:all",
  // "-Werror",
  "-deprecation",
  "-explain",
  "-explain-cyclic",
  "-rewrite",
  // "-source:3.6",
  "-source:future",
  "-language:experimental.modularity"
)

lazy val web = project
  .in(file("app-web"))
  .settings(
    name    := "web",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "dev.zio"              %% "zio-json"             % zioJsonVersion,
      "dev.zio"              %% "zio-http"             % zioHttpVersion,
      "io.getquill"          %% "quill-jdbc-zio"       % zioQuillVersion,
      "dev.zio"              %% "zio-config"           % zioConfigVersion,
      "dev.zio"              %% "zio-config-magnolia"  % zioConfigVersion,
      "dev.zio"              %% "zio-config-typesafe"  % zioConfigVersion,
      "dev.zio"              %% "zio-config-refined"   % zioConfigVersion,
      "dev.zio"              %% "zio-logging"          % zioLoggingVersion,
      "mysql"                 % "mysql-connector-java" % mysqlVersion,
      "com.github.jwt-scala" %% "jwt-core"             % jwtCoreVersion,
      "pt.kcry"              %% "sha"                  % scalaShaVersion,
      "org.flywaydb"          % "flyway-core"          % flywaydbVersion,
      "org.flywaydb"          % "flyway-mysql"         % flywaydbVersion,
      "dev.zio"              %% "zio-test"             % zioTestVersion % Test,
      "dev.zio"              %% "zio-test-sbt"         % zioTestVersion % Test,
      "dev.zio"              %% "zio-http-testkit"     % zioHttpVersion % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
  .dependsOn(shared.jvm)

lazy val app = project
  .in(file("app-ui"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name                            := "app",
    version                         := "0.1.0-SNAPSHOT",
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
    },
    scalaJSLinkerConfig ~= {
      _.withSourceMap(false)
    },
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "io.github.cquiroz" %%% "scala-java-time"           % scalaJavaTimeVersion,
      "io.github.cquiroz" %%% "scala-java-time-tzdb"      % scalaJavaTimeVersion,
      "org.scala-js"      %%% "scalajs-java-securerandom" % "1.0.0" cross CrossVersion.for3Use2_13,
      // zio
      "dev.zio"           %%% "zio"                       % zioVersion,
      "dev.zio"           %%% "zio-json"                  % zioJsonVersion,
      "dev.zio"           %%% "zio-prelude"               % zioPreludeVersion,
      // laminar
      "com.raquo"         %%% "laminar"                   % laminarVersion,
      "io.laminext"       %%% "fetch"                     % fetchVersion,
      "io.laminext"       %%% "tailwind"                  % "0.17.0",
      "io.frontroute"     %%% "frontroute"                % frontrouteVersion
    )
  )
  .dependsOn(shared.js)

lazy val shared =
  crossProject(JSPlatform, JVMPlatform)
    .in(file("app-shared"))
    .settings(
      name := "shared",
      libraryDependencies ++= Seq(
        "dev.zio"      %%% "zio-json" % zioJsonVersion,
        "io.scalaland" %%% "chimney"  % chimneyVersion
      )
    )
//    .jvmSettings(
//      // Add JVM-specific settings here
//      libraryDependencies ++= Seq("dev.zio" %% "zio-json" % zioJsonVersion)
//    )
//    .jsSettings(
//      // Add JS-specific settings here
////      scalaJSUseMainModuleInitializer := true,
//      libraryDependencies ++= Seq("dev.zio" %%% "zio-json" % zioJsonVersion)
//    )
