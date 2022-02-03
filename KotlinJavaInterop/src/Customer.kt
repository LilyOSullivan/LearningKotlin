data class Customer(val id: Long, val name: String)

class CustomerDatabase() {
    val customers = listOf(
        Customer(1, "Matt"),
        Customer(2, "James"),
        Customer(3, "Diane"),
        Customer(4, "Sally")
    )

    @Throws(IllegalAccessException::class)
    fun addCustomer(c: Customer) {
        throw IllegalAccessException("Cannot added a customer")
    }

    companion object {
        @JvmStatic
        fun helloWorld() = println("Hello World")
    }

}
