plugins {
    id("app.android.feature")
    id("app.android.library.jacoco")
}

android {
    namespace = "com.mortitech.blueprint.feature.auth.email"

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.androidx.lifecycle.viewmodel)
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)
}

kapt {
    correctErrorTypes = true
}