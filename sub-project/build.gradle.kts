
dependencies {
    implementation(project(":parent-project", configuration = "namedElements"))
}

// doesn't help
loom {
    mods {
        create("bbbb") {
            sourceSet(sourceSets.main.get())
            sourceSet(sourceSets.client.get())
        }
    }
}