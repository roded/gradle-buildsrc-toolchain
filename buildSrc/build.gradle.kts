plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}
