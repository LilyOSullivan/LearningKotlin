package com.lily.learningkotlin.kotlin

data class Customer(
    val name: String,
    val address: String,
    var age: Int
) {
    constructor(name: String, age: Int) : this(name, "", age) {
        println("Secondary Constructor!!")
    }

    init {
        println("\t\tInit Block")
    }
}

class AlternativeCustomer(val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

class AnotherAlternativeCustomer(val name: String, val address: String = "", var age: Int) {
    operator fun component1() = name
    operator fun component2() = address
    operator fun component3() = age

    var approved = false
        set(value) {
            if (age >= 21) {
                field = value
            } else {
                println("You must be over 21!")
            }
        }
        get() {
            return field
        }
    val nextAge
        get() = age + 1

    fun uppercaseName() = this.name.uppercase()

    override fun toString() = "$name,$address,$age"

    companion object {
        fun getInstance() = AnotherAlternativeCustomer("nnaammee","Kilkenny",12)
    }

}

fun main() {
    val c1 = AnotherAlternativeCustomer(name = "Lily", age = 21)
    val c2 = AnotherAlternativeCustomer("Lily2", age = 21)
    c1.age = 19
    c1.approved = true
    println(c1.approved)
    println(c1.nextAge)
    println(c1.uppercaseName())
    println(c1)

    println(AnotherAlternativeCustomer.getInstance())

    val c4 = Customer("c4","Address1",20)
    println(c4)

    val c5 = c4.copy(name="Sarah")
    println(c5)

    val (name,address,age) = c5
    println(age)
}