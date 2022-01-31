package com.lily.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val myDouble = 21.4

    println("Is myDouble a double? ${myDouble is Double}")
    println("myDouble: JavaClass ${myDouble::class.qualifiedName}")

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}, javaClass ${myInteger.javaClass}")
    var anotherInteger:Int = 17
    println()

    var bd:BigDecimal = BigDecimal(12)
    val bd2:BigDecimal
    bd2 = bd.add(BigDecimal(30))

    println(bd.toString())
    println()

    var name = "Lily"
    val surname: String = "O'Sullivan"

    name = "XXX"

    println("Hello $name ${surname.uppercase()}")
    println("Your name has ${name.length} characters")
    println("Your product costs $10")
    println("Your product costs \$ten")

    val story = """It was a dark and stormy night
        |A foul smell crept across the city.
        |Jane wondered what time it was, and when it would be daylight""".trimMargin("|")

//    println(story)

    println(story.replaceAfterLast("it", " would be dawn"))
}