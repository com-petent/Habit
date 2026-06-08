// Файл: settings.gradle.kts
pluginManagement {
    repositories {
        // Зеркало Яндекса для плагинов (качает мгновенно)
        maven { url = java.net.URI("https://mirror.yandex.ru/mirrors/maven-central/") }

        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // Зеркало Яндекса для библиотек
        maven { url = java.net.URI("https://mirror.yandex.ru/mirrors/maven-central/") }
        google()
        mavenCentral()
    }
}

rootProject.name = "HabitTracker"
include(":app")