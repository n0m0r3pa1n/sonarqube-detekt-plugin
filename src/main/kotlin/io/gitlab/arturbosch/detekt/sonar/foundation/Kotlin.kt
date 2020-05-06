package io.gitlab.arturbosch.detekt.sonar.foundation

import io.gitlab.arturbosch.detekt.sonar.DetektPlugin
import org.sonar.api.utils.log.Logger
import org.sonar.api.utils.log.Loggers

const val LANGUAGE_KEY = "kotlin"
const val REPOSITORY_KEY = "georgi-sonar-detekt"

const val DETEKT_WAY = "detekt active"
const val DETEKT_FAIL_FAST = "detekt all"
const val DETEKT_SENSOR = "GeorgiDetekt"
const val DETEKT_ANALYZER = "Georgi Detekt Custom Thing"

val logger: Logger = Loggers.get(DetektPlugin::class.java)
