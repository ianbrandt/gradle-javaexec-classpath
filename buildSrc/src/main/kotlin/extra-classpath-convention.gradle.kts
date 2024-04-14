afterEvaluate {

    tasks.withType<JavaExec>().configureEach {

        val projectDirectory = layout.projectDirectory

        val extraDirectory = projectDirectory.dir("src/main/extra")

        // Append the extra source directory to the classpath.
        classpath(file(extraDirectory))
    }
}
