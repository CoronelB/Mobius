plugins {
    id("com.itdevexpert.mobius.android-library")
    id("kotlin-android")
}

android {

    defaultConfig {
        versionCode = 1
        versionName = "0.0"
    }

    kotlinOptions {
        jvmTarget = V.JVM.Kotlin.target
        useIR = true    //TODO: Check if is necessary
    }

    buildFeatures {
//        Enables Jetpack Compose for this module
        compose = true
    }

//    TODO: Migrate to some compose plugin
    composeOptions {
        kotlinCompilerExtensionVersion = V.AndroidX.Compose.jetpackCompose
    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(":androidApp:feature-sign-up:public"))
    implementation(project(":kmm_shared:feature_sign_up"))

    implementation(project(":androidApp:domain"))
    implementation(project(":androidApp:shared"))
    implementation(project(":androidApp:view"))
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")
}