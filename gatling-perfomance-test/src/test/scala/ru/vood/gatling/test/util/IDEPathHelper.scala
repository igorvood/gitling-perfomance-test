package ru.vood.gatling.test.util

import java.nio.file.{Path, Paths}

object IDEPathHelper {

  def mavenSourcesDirectory: Path = mavenSrcTestDirectory.resolve("scala")

  private def mavenSrcTestDirectory = projectRootDir.resolve("src").resolve("test")

  private def projectRootDir = Paths.get(getClass.getClassLoader.getResource("gatling.conf").toURI).getParent.getParent.getParent

  def mavenBinariesDirectory: Path = mavenTargetDirectory.resolve("test-classes")

  def resultsDirectory: Path = mavenTargetDirectory.resolve("gatling")

  private def mavenTargetDirectory = projectRootDir.resolve("target")

  def recorderConfigFile: Path = mavenResourcesDirectory.resolve("recorder.conf")

  def mavenResourcesDirectory: Path = mavenSrcTestDirectory.resolve("src/test/resources")
}
