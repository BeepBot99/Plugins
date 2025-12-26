package dev.frozenmilk.libs

import dev.frozenmilk.FTC
import dev.frozenmilk.easyautolibraries.EasyAutoDependency
import dev.frozenmilk.easyautolibraries.EasyAutoScope

@Suppress("unused", "PropertyName")
class Dairy(ftc: FTC) : EasyAutoScope<Dairy>(ftc) {

    //
    // Util
    //

    val Util by dependency {
        EasyAutoDependency(
            group = "dev.frozenmilk.dairy",
            artifact = "Util",
            version = "1.2.2",
        )
    }

    val UtilUnit by dependency {
        EasyAutoDependency(
            group = "dev.frozenmilk.dairy",
            artifact = "Util-Unit",
            version = "1.1.0",
        )
    }

    //
    // Sinister
    //

    val Sinister by dependency {
        EasyAutoDependency(
            group = "dev.frozenmilk",
            artifact = "Sinister",
            version = "2.2.0",
        )
    }

    val Sloth by dependency {
        EasyAutoDependency(
            group = "dev.frozenmilk.sinister",
            artifact = "Sloth",
            version = "0.2.4",
        )
    }

    val slothboard by dependency {
        EasyAutoDependency(
            group = "com.acmerobotics.slothboard",
            artifact = "dashboard",
            version = "0.2.4+0.4.17",
        ) {
            incompatibleWith(
                dependency = ftc.acmerobotics.dashboard,
                reason = "slothboard is a drop-in replacement for dashboard",
            )
        }
    }

    //
    // Mercurial
    //

    val Mercurial by dependency {
        EasyAutoDependency(
            group = "dev.frozenmilk.dairy",
            artifact = "Mercurial",
            version = "2.0.0-beta8",
        )
    }

    val MercurialFTC by dependency {
        EasyAutoDependency(
            group = "dev.frozenmilk.dairy",
            artifact = "MercurialFTC",
            version = "2.0.0-beta9",
        )
    }
}