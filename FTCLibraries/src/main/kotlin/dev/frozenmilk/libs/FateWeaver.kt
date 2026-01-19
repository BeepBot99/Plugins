package dev.frozenmilk.libs

import dev.frozenmilk.FTC
import dev.frozenmilk.easyautolibraries.EasyAutoDependency
import dev.frozenmilk.easyautolibraries.EasyAutoScope

@Suppress("unused")
class FateWeaver(ftc: FTC) : EasyAutoScope<FateWeaver>(ftc)  {
    private fun dependency(version: String) = dependency { name ->
        EasyAutoDependency(
            group = "gay.zharel.fateweaver",
            artifact = name,
            version = version
        )
    }

    val core by dependency("0.3.3")
    val ftc by dependency("0.3.3")
}