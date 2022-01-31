import java.math.BigDecimal

interface BookingManager {
    val version: String
    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerID: Long): Boolean
    fun systemStatus() = "All Operations are Functional"
}
class UnathorisedUserException: Throwable()

open class BasicBookingManager(authorisationKey: String) : BookingManager {
    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerID: Long) = false

    init {
        if(authorisationKey != "12345") throw UnathorisedUserException()
    }

}

class AdvancedBookingManager : BasicBookingManager("12345"),java.io.Closeable {
    override val version = "2.0"

    fun howManyBookings() = 10

    override fun close() {

    }
}

fun String.toSentenceCase() : String {
    return this[0].uppercase() + this.substring(1)
}



fun main() {
    println(AdvancedBookingManager().isSeatFree(Seat(1, 1, BigDecimal.ZERO, "")))

    val greeting = "Welcome to the system"
    println(greeting.toSentenceCase())

}