package com.lily.application

import com.lily.utilities.toSentenceCase


fun applySomeFunctionToString(input: String, myFunction: (String) -> String): String {
    return myFunction(input)
}

fun main(args: Array<String>) {
    val result = applySomeFunctionToString("hello", ::toSentenceCase)
    val result2 = applySomeFunctionToString("hello") { it.uppercase() }
    println(result)
    println(result2)

    val colours = listOf("red", "green", "blue", "black")
    val uppercaseColours = colours.map { it.uppercase() }
    uppercaseColours.forEach { println(it) }

    val colorsStartingWithB = colours.filter { it.startsWith('b') }
        .forEach { println(it) }

    colours.flatMap { if (it.startsWith('b')) listOf(it, it) else listOf(it) }.forEach { println(it) }
    println(colours.reduce { result, value -> "$result, $value" })

    val numbers = colours.map { it.length }
    println(numbers)
    println(numbers.sum())
    println(numbers.average())
    println(numbers.count())

    println(numbers.fold(0) { result, value -> if (value > result) value else result })

    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    println( myMap.filter { (k,v) -> v.startsWith('t') })
}