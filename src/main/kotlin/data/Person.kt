package data

class Person{

    var firstNAme: String = ""
    var middleNAme: String? = null
    var lastName: String = ""


    fun sayHello(name: String){
        println("$name adalah masa depan $middleNAme")
    }

//    function overloading(membuat nama function sama dalam 1 class dengan parameter berbeda)
    fun sayHello(nama1: String, nama2: String) {
        println("$nama1 $nama2 adalah masa depan $middleNAme Aamiin...")
    }

//    this keyword
fun sayFuture(firstName: String, lastName: String) {
    println("$firstName $lastName adalah masa depan ${this.lastName} Aamiin...")
}

    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String{
        return "$firstNAme $middleNAme $lastName"
    }
}