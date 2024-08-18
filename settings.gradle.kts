pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id ("com.android.application") version "8.2.2"
        id ("org.jetbrains.kotlin.android") version "1.9.25"
        id ("dagger.hilt.android.plugin") version "2.44"
    }

}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CleanArchitctureNoteApp"
include(":app")
 