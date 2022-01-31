interface BookingManager {
    val version: String
    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerID: Long): Boolean
    fun systemStatus() = "All Operations are Functional"
}

class BasicBookingManager : BookingManager {
    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerID: Long) = false


}