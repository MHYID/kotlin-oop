package data

// ini primary constructor
class Car(paramBrand: String, paramName:String, paramYear: Int) {

    /**
     * untuk init diusahakan kode yang sederrhana saja
     * karena terlalu berat maka akan berat aplikasinya
     * not recommended
     */
    init {
        println("Car $paramBrand dibuat")
    }

//    constructor secondary
    constructor(paramBrand: String, paramName: String): this(paramBrand, paramName, 2022){
        println("secondary constructor 1")
    }

//    constructor secondary tidak wajib ke primary bisa juga ke secondary
    constructor(paramBrand: String):this(paramBrand, ""){
        println("secondary constructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear



}