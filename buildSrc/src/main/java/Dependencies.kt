object Versions {
    const val kotlin_version = "1.3.72"
    const val core_ktx = "1.3.1"
    const val appcompat = "1.2.0"
    const val constraintlayout = "1.1.3"
    const val buildGradle = "4.0.1"
}

object Kotlin {
    const val kotlinStandardLibrary =
        "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
}

object AndroidX {
    const val coreKtx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
}

object Gradle {
    const val buildGradle = "com.android.tools.build:gradle:${Versions.buildGradle}"
    const val buildGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
}