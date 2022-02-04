package com.lily.utilities

fun toSentenceCase(input: String): String {
    return input[0].uppercase() + input.substring(1)
}

fun main(args: Array<String>) {
    println(toSentenceCase("hello"))
}