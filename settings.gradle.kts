pluginManagement {
	plugins {
		// Update this in libs.version.toml when you change it here.
		kotlin("jvm") version "2.0.20-Beta1"
		kotlin("plugin.serialization") version "2.0.20-Beta1"

		// Update this in libs.version.toml when you change it here.
		id("io.gitlab.arturbosch.detekt") version "1.23.6"

		id("com.github.jakemarsden.git-hooks") version "0.0.2"
		id("com.github.johnrengelman.shadow") version "8.1.1"
	}
}

rootProject.name = "template"
