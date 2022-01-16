package app

import data.Car

fun main() {
    val motor = Car("Win")
    val mobil = Car("Pajero", "yuhu")

    println(motor.brand)
    println(mobil.brand)
    println(mobil.year)
}