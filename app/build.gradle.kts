plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.group5.estoreapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.group5.estoreapp"
        minSdk = 30
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation ("org.osmdroid:osmdroid-android:6.1.16")
    implementation ("org.osmdroid:osmdroid-wms:6.1.16")
    implementation ("org.osmdroid:osmdroid-mapsforge:6.1.16")

// OpenRouteService - REST API client
    implementation ("com.squareup.okhttp3:okhttp:4.11.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.11.0")


    implementation ("org.osmdroid:osmdroid-android:6.1.16")
    implementation("com.android.volley:volley:1.2.1")
    // Glide for image loading
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation(libs.car.ui.lib)
    implementation(libs.play.services.location)
    implementation(libs.protolite.well.known.types)
    implementation(libs.swiperefreshlayout)
    annotationProcessor ("com.github.bumptech.glide:compiler:4.16.0")

    // Gson for JSON parsing
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
    implementation ("com.auth0.android:jwtdecode:2.0.1")
    implementation ("com.microsoft.signalr:signalr:6.0.2")


    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

}