@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.safeArgs) apply false
    alias(libs.plugins.junit5Android) apply false
    alias(libs.plugins.spotless)
    alias(libs.plugins.detekt)
}

subprojects {
    tasks.withType<Test> {
        maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2).takeIf { it > 0 } ?: 1
    }
}

spotless {
    kotlin {
        target("**/*.kt", "**/*.kts")
        ktlint()

        indentWithSpaces()
        endWithNewline()
    }
}
