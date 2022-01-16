package app

import data.Address

fun main() {
    val address1 = Address("jalan a", "jakarta")
    val address2 = Address("kesamben", "doko", "bismillah")

    println(address1.street)
    println(address2.city)
}