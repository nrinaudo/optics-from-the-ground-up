enablePlugins(TutPlugin, GhpagesPlugin)

organization := "com.nrinaudo"
scalaVersion := "2.12.11"
graphvizStylesheet := Some(graphvizSourceDirectory.value / "style.dss")

Tut / siteSubdirName := "./"

addMappingsToSiteDir(tut, Tut / siteSubdirName)

SitePlugin.autoImport.makeSite / includeFilter :=
    "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"

git.remoteRepo := "git@github.com:nrinaudo/optics-from-the-ground-up.git"

libraryDependencies ++= Seq(
  "com.chuusai"                %% "shapeless"     % "2.3.3",
  "com.github.julien-truffaut" %% "monocle-core"  % "2.0.4",
  "com.github.julien-truffaut" %% "monocle-macro" % "2.0.4",
  "com.softwaremill.quicklens" %% "quicklens"     % "1.5.0",
  "org.scalaz"                 %% "scalaz-core"   % "7.2.30"
)
