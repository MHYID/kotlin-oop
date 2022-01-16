package app

import data.Person

fun main() {

    val m = Person()
    m.firstNAme = "Muhamad"
    val hamdan = Person()
    hamdan.firstNAme = "Hamdan"
    val yusuf = Person()
    yusuf.firstNAme = "YUsuf"

    println(m.firstNAme)
    println(hamdan.firstNAme)
    println(yusuf.firstNAme)
}