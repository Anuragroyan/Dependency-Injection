plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id ("kotlin-kapt")
}

android {
    namespace = "com.example.dependency_injection"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dependency_injection"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.dagger)
    implementation(libs.volley)
    implementation(libs.swiperefreshlayout)
    implementation(libs.play.services.basement)
    kapt(libs.dagger.compiler)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.core.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}