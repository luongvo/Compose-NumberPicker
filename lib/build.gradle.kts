plugins {
    id("com.android.library")
    id("kotlin-android")
    id("common")
    id("maven-publish")
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.luongvo"
            artifactId = "Compose-NumberPicker"
            version = "1.0.5"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

dependencies {
    api("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
    api("androidx.compose.material:material:${Versions.compose}")

    testImplementation("junit:junit:4.13.2")
}

repositories {
    google()
    mavenCentral()
}
