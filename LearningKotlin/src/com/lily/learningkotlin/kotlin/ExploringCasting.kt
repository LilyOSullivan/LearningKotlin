package com.lily.learningkotlin.kotlin

import java.math.BigDecimal
import java.util.*

fun main() {
    var result:Any
    val randomNumber = Random().nextInt(3)
    if(randomNumber == 1) {
        result = BigDecimal(30);
    }
    else {
        result = "hello";
    }
    println("Result is: $result");
    if(result is BigDecimal) {
        result = result.add(BigDecimal(47))
    }
    else {
        result = (result as String).uppercase()
    }
    println("Result is: $result");

}