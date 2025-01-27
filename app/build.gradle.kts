plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "org.codeforegypt.cleanarchitcturenoteapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "org.codeforegypt.cleanarchitcturenoteapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        javaCompileOptions {
            annotationProcessorOptions {
                javaCompileOptions {
                    annotationProcessorOptions {
                        arguments.put("room.schemaLocation", "$projectDir/schemas".toString())
                    }
                }

                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                vectorDrawables {
                    useSupportLibrary = true

                }
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
                jvmTarget = "1.8"
            }
            buildFeatures {
                compose = true
            }
            composeOptions {
                kotlinCompilerExtensionVersion = "1.5.15"
            }
            packaging {
                resources {
                    excludes += "/META-INF/{AL2.0,LGPL2.1}"
                }
            }
        }

        dependencies {
            implementation("androidx.core:core-ktx:1.12.0")
            implementation("androidx.appcompat:appcompat:1.6.1")
            implementation("com.google.android.material:material:1.10.0")
            implementation("androidx.compose.ui:ui:1.6.0")
            implementation("androidx.compose.material:material:1.6.0")
            implementation("androidx.compose.ui:ui-tooling-preview:1.6.0")
            implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
            implementation("androidx.activity:activity-compose:1.8.0")
            testImplementation("junit:junit:4.13.2")
            androidTestImplementation("androidx.test.ext:junit:1.1.5")
            androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
            androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.6.0")
            debugImplementation("androidx.compose.ui:ui-tooling:1.6.0")

            // Compose dependencies
            implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
            implementation("androidx.navigation:navigation-compose:2.7.3")
            implementation("androidx.compose.material:material-icons-extended:1.6.0")
            implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

            // Coroutines
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

            //Dagger - Hilt
            implementation("com.google.dagger:hilt-android:2.48")
            kapt("com.google.dagger:hilt-android-compiler:2.48")

            // Hilt Navigation Compose
            implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
            kapt("androidx.hilt:hilt-compiler:1.0.0")

            // Room
            implementation("androidx.room:room-runtime:2.6.1")
            kapt("androidx.room:room-compiler:2.6.1")

            // Kotlin Extensions and Coroutines support for Room
            implementation("androidx.room:room-ktx:2.6.1")

            implementation("androidx.compose.material3:material3:1.1.0")

            implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
            implementation("androidx.navigation:navigation-compose:2.7.0")


        }
    }
}

