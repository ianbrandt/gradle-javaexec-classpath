plugins {
    kotlin("jvm") version "1.9.23"
    // The `run` task succeeds if "application-convention" is
    // applied before "extra-classpath-convention".
    id("extra-classpath-convention")
    id("application-convention")
}

application {
    mainClass = "com.example.MainKt"
}
