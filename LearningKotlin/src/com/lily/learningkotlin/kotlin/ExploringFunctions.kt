package com.lily.learningkotlin.kotlin

private fun printString(value:String) {
    println(value)
}

fun addTwoNumbers(one: Double, two: Double) = one + two

fun printSomeMaths(one:Double=0.1,two:Double=3.9) {
    println("one + two is ${one+two}")
    println("one - two is ${one-two}")

    fun functionWithinAFunction(a: String) = println(a)

    functionWithinAFunction("Hello")
}

fun methodTakesALambda(input:String,action: (String)->Int) {
    println(action(input))
}

fun main() {
    printSomeMaths()

}