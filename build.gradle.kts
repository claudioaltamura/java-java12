import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    java
    idea
    eclipse
    id("com.github.ben-manes.versions") version "0.39.0"
    id("com.diffplug.spotless") version "5.12.5"
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_12
    targetCompatibility = JavaVersion.VERSION_12
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

val test by tasks.getting(Test::class) {
    jvmArgs("--enable-preview")
    useJUnitPlatform()
    testLogging {
        events = setOf(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
    }
}