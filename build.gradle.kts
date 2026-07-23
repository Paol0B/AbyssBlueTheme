plugins {
    id("org.jetbrains.intellij.platform") version "2.18.1"
}

group = providers.gradleProperty("pluginGroup").get()
version = providers.gradleProperty("pluginVersion").get()

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        create(
            providers.gradleProperty("platformType"),
            providers.gradleProperty("platformVersion")
        )
        pluginVerifier()
    }
}

intellijPlatform {
    pluginConfiguration {
        id = "${providers.gradleProperty("pluginGroup").get()}.abyss-blue"
        name = "Abyss Blue"
        version = providers.gradleProperty("pluginVersion")

        ideaVersion {
            sinceBuild = providers.gradleProperty("pluginSinceBuild")
            // Only set an upper bound when one is explicitly provided; an empty
            // value leaves until-build open so the theme works on all newer IDEs.
            val until = providers.gradleProperty("pluginUntilBuild").orNull
            if (!until.isNullOrBlank()) {
                untilBuild = until
            } else {
                untilBuild = provider { null }
            }
        }

        vendor {
            name = "Paolo Bertinetti"
            url = "https://github.com/paol0b/AbyssBlueTheme"
        }

        description = """
            <p>Bring a sleek, minimal dark aesthetic to IntelliJ IDEA and all JetBrains IDEs.</p>

            <h3>Features</h3>
            <ul>
              <li><b>Island UI</b> — Dark islands (#11151C) floating on a near-black canvas (#0D1015) for a clean, focused look.</li>
              <li><b>Reasoned syntax palette</b> — One color per role, identical across C, C++, Rust, Go, Java/Kotlin, C#, Python and more: purple keywords, teal types, blue functions, green strings, orange literals, gold annotations. No duplicate or clashing roles.</li>
              <li><b>Built for readability</b> — Bold default text and a cool blue-slate surface scale; every syntax color meets WCAG AA contrast on the editor background.</li>
              <li><b>Complete coverage</b> — Every UI surface is themed: popups, tool windows, tabs, notifications, VCS, debugger, breadcrumbs, and more.</li>
              <li><b>Semantic color system</b> — Built on a layered token architecture for consistent contrast across all components.</li>
            </ul>

            <h3>Color Palette</h3>
            <ul>
              <li>Islands / Editor: <code>#11151C</code></li>
              <li>Canvas / Background: <code>#0D1015</code></li>
              <li>Popups / Menus: <code>#11151B</code></li>
              <li>Keywords: purple · Types: teal · Functions: blue · Strings: green · Literals: orange</li>
            </ul>

            <p>Designed for developers who want a clean, minimal look with the full power of IntelliJ IDEA.</p>
        """.trimIndent()
    }

    pluginVerification {
        ides {
            recommended()
        }
    }
}
