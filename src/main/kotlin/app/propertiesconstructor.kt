package app

import data.User

fun main() {
    val user1 = User("ulfa", "hamdan")
    val user2 = User("hamdan", "ulfa")

    println(user1.paramUsername)
    println(user1.paramPassword)

    println(user2.paramUsername)
    println(user2.paramPassword)
}