plugins {
    alias(
        libs.plugins.android.application
    )
}

android {
    namespace =
        "com.example.pas_genap_23_35"
    compileSdk =
        35

    defaultConfig {
        applicationId =
            "com.example.pas_genap_23_35"
        minSdk =
            27
        targetSdk =
            35
        versionCode =
            1
        versionName =
            "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled =
                false
            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures{
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility =
            JavaVersion.VERSION_11
        targetCompatibility =
            JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(
        libs.appcompat
    )
    implementation(
        libs.material
    )
    implementation(
        libs.activity
    )
    implementation(
        libs.constraintlayout
    )
    // Retrofit
    implementation(
        "com.squareup.retrofit2:retrofit:2.9.0"
    )
    implementation(
        "com.squareup.retrofit2:converter-gson:2.9.0"
    )
    implementation(
        "androidx.recyclerview:recyclerview:1.3.0"
    )
    // Glide
    implementation(
        "com.github.bumptech.glide:glide:4.16.0"
    )
    // Swipe refresh
    implementation(
        "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
    )
    testImplementation(
        libs.junit
    )
    androidTestImplementation(
        libs.ext.junit
    )
    androidTestImplementation(
        libs.espresso.core
    )
}