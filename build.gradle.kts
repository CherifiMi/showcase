plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.safeArgs) apply false
    alias(libs.plugins.junit5Android) apply false
    alias(libs.plugins.spotless)
    alias(libs.plugins.detekt)
}

/*
configure(){
    configure{
        parallel = true
        ignoreFailures = false
        setSource(file(projectDir))
    }
}*/
