package com.lily.theater.services

import com.lily.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService {
    fun isSeatFree(seat: Seat):Boolean {
        return true
    }
}