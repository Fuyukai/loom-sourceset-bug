import net.fabricmc.loom.api.LoomGradleExtensionAPI

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/8.1.1/samples
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("fabric-loom").version("1.3.2").apply(false)
}

subprojects {
    apply(plugin = "fabric-loom")

    dependencies {
        "minecraft"("com.mojang:minecraft:1.20.1")
        "mappings"("net.fabricmc:yarn:1.20.1+build.9:v2")

        "modImplementation"("net.fabricmc:fabric-loader:0.14.21")
    }

    val loom = the<LoomGradleExtensionAPI>()
    loom.splitEnvironmentSourceSets()

    loom.runs {
        // not even going into this one
        getByName("client").ideConfigGenerated(true)
    }
}
