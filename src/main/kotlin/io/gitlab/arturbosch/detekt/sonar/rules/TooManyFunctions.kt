package io.gitlab.arturbosch.detekt.sonar.rules

import io.gitlab.arturbosch.detekt.api.*
import org.jetbrains.kotlin.com.intellij.psi.PsiFile

class TooManyFunctions : Rule() {

    override val issue = Issue(javaClass.simpleName, Severity.CodeSmell, "Way way way tooo many functions!", Debt.TWENTY_MINS)

    private var amount: Int = 0

    override fun visitFile(file: PsiFile) {
        super.visitFile(file)
        report(CodeSmell(issue, Entity.from(file), "Way way way tooo many functions!"))
    }
}