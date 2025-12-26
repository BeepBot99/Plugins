package dev.frozenmilk.libs

import dev.frozenmilk.FTC
import dev.frozenmilk.easyautolibraries.EasyAutoDependency
import dev.frozenmilk.easyautolibraries.EasyAutoScope

@Suppress("unused")
class ACMERobotics(ftc: FTC) : EasyAutoScope<ACMERobotics>(ftc) {
    class RoadRunner(ftc: FTC) : EasyAutoScope<RoadRunner>(ftc) {
        private fun dependency(version: String) = dependency { name ->
            EasyAutoDependency(
                group = "com.acmerobotics.roadrunner",
                artifact = name,
                version = version,
            ) {
                // we don't want to get dashboard with it
                excludeGroup("com.acmerobotics.dashboard")
            }
        }

        val core by dependency("1.0.1")
        val actions by dependency("1.0.1")
        val ftc by dependency("0.1.25")
    }

    val roadrunner = RoadRunner(ftc)

    val dashboard by dependency {
        EasyAutoDependency(
            group = "com.acmerobotics.dashboard",
            artifact = "dashboard",
            version = "0.5.1",
        )
    }
}
