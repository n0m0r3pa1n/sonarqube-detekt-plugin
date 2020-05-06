package io.gitlab.arturbosch.detekt.sonar

import io.gitlab.arturbosch.detekt.sonar.rules.DetektRulesDefinition
import org.sonar.api.Plugin

class DetektPlugin : Plugin {

    override fun define(context: Plugin.Context) {
        context.addExtension(DetektRulesDefinition::class.java)
    }
}
