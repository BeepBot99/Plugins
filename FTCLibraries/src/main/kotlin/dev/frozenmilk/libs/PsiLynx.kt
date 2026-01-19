package dev.frozenmilk.libs

import dev.frozenmilk.FTC
import dev.frozenmilk.easyautolibraries.EasyAutoDependency
import dev.frozenmilk.easyautolibraries.EasyAutoScope

@Suppress("unused")
class PsiLynx(ftc: FTC) : EasyAutoScope<PsiLynx>(ftc) {
    private fun psikit(version: String) = dependency { name ->
        EasyAutoDependency(
            group = "org.psilynx.psikit",
            artifact = name,
            version = version
        )
    }

    val core by psikit("0.1.0-beta2")
    val ftc by psikit("0.1.0-beta2")
}