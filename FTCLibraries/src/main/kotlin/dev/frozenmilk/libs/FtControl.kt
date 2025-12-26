package dev.frozenmilk.libs

import dev.frozenmilk.FTC
import dev.frozenmilk.easyautolibraries.EasyAutoDependency
import dev.frozenmilk.easyautolibraries.EasyAutoScope

@Suppress("unused")
class FtControl(ftc: FTC) : EasyAutoScope<FtControl>(ftc) {
    private fun plugin(version: String) = dependency { name ->
        EasyAutoDependency(
            group = "com.bylazar",
            artifact = name,
            version = version,
        )
    }

    val panels by plugin("1.0.5")

    val battery by plugin("1.0.3")
    val camerastream by plugin("1.0.0")
    val capture by plugin("1.0.3")
    val configurables by plugin("1.0.5")
    val field by plugin("1.0.6")
    val gamepad by plugin("1.0.4")
    val graph by plugin("1.0.4")
    val lights by plugin("1.0.3")
    val limelightproxy by plugin("1.0.4")
    val opmodecontrol by plugin("1.0.3")
    val pinger by plugin("1.0.3")
    val telemetry by plugin("1.0.5")
    val themes by plugin("1.0.3")
    val utils by plugin("1.0.4")

    val fullpanels by plugin("1.0.12")
}