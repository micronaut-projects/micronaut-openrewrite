plugins {
    id("io.micronaut.build.internal.openrewrite-module")
}

dependencies {
    api(libs.micronaut.rewrite)
    constraints {
        // rewrite-core pins micrometer-core 1.9.17, which is affected by GHSA-g3pr-3p32-fp23
        api(libs.micrometer.core)
    }
}
