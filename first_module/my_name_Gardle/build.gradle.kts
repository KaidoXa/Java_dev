plugins {
    id 'java'
    id 'application'
}

group = 'com.example'
version = '1.0.0'

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.google.code.gson:gson:2.10.1'
}

application {
    mainClass = 'com.example.Main'
}

jar {
    archiveBaseName = 'myname'
    archiveVersion = ''

    manifest {
        attributes 'Main-Class': 'com.example.Main'
    }

    from {
        configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

// Альтернативно можна використовувати shadowJar plugin
// Розкоментуйте наступні рядки якщо хочете використовувати shadowJar:
/*
plugins {
    id 'com.github.johnrengelman.shadow' version '8.1.1'
}

shadowJar {
    archiveBaseName = 'myname'
    archiveVersion = ''
    archiveClassifier = ''
}
*/