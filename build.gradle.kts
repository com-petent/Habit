plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    // Обновляем KSP под Kotlin 2.0.21
    id("com.google.devtools.ksp") version "2.0.21-1.0.26" apply false

    // Обновляем плагин Compose под Kotlin 2.0.21
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21" apply false
}