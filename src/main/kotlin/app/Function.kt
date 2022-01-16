package app

import data.Person

fun main() {
    val hamdan = Person()

    hamdan.firstNAme = "M."
    hamdan.middleNAme = "Hamdan"
    hamdan.lastName = "Yusuf"

    hamdan.sayHello("ULfatul", "Qoidah")
    hamdan.sayHello("ulfaku")
    val fullName = hamdan.getFullName()
    println(fullName)
}