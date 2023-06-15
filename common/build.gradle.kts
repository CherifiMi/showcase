@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.symbolProcessing)
    alias(libs.plugins.safeArgs)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.testLogger)
    alias(libs.plugins.junit5Android)
}

android {
    namespace = "com.example.common"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.showcase"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerExtensionVersion.get()
    }
}

dependencies {
    api(libs.kotlin)
    api(libs.playCore)
    api(libs.coreKtx)
    api(libs.fragmentKtx)
    api(libs.viewBindingPropertyDelegate)
    api(libs.timber)
    api(libs.constraintLayout)
    api(libs.appCompat)
    api(libs.recyclerView)
    api(libs.coroutines)
    api(libs.material)
    api(libs.composeMaterial)
    api(libs.accompanistFlowLayout)
    api(libs.bundles.koin)
    api(libs.bundles.retrofit)
    api(libs.bundles.navigation)
    api(libs.bundles.lifecycle)
    api(libs.bundles.room)
    api(libs.bundles.compose)

    testImplementation(projects.libraryTestUtils)
    testImplementation(libs.bundles.test)

    testRuntimeOnly(libs.junitJupiterEngine)
}
