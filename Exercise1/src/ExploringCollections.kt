fun main() {
    val colours = listOf("Red","Green","Blue")
    println(colours::class.qualifiedName)

    val days = mutableListOf("Monday","Tuesday","Wednesday","Thursday")
    val months = setOf("January","February","March")
    println(months::class.qualifiedName)

    val webColours = mapOf("red" to "ff0000","blue" to "00ff00")
    println(webColours::class.qualifiedName)

    val numbersArr:Array<Int> = arrayOf(1,2,3,4,5)
    numbersArr[3] = -4
    numbersArr.forEach { println(it) }
    println(colours[2])




}