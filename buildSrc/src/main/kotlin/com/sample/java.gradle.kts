package com.sample

plugins {
    `java`
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xlint:deprecation")
}

tasks.withType<Test> {
    minHeapSize = "128m"
    maxHeapSize = "256m"
    testLogging.showStandardStreams = true
    systemProperty("java.util.logging.config.file", "$rootDir/build-config/logging.properties")
    maxParallelForks = Runtime.getRuntime().availableProcessors() - 1
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
}
