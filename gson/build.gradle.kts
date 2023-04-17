plugins {
    id("java-library")
    id("maven-publish")
}

group = rootProject.group.toString() + "." + rootProject.name
version = rootProject.version

repositories {
    mavenCentral()
}

dependencies {
    api(project(":json"))
    api("com.google.code.gson:gson:2.10.1")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }

    // TODO: We should probably put this on central
    repositories {
        val ENV = System.getenv()

        ENV["MAVEN_URL"]?.let {
            repositories.maven {
                url = uri(it)

                credentials {
                    username = ENV["MAVEN_USERNAME"]!!
                    password = ENV["MAVEN_PASSWORD"]!!
                }
            }
        } ?: run {
            mavenLocal()
        }
    }
}
