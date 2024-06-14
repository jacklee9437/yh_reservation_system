package com.yhrsv.reservation_system.model

import jakarta.persistence.Convert
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity(name = "reservation")
data class Reservation(
    @Id
    val id: Long,
    val name: String,
    val phoneNumber: String,
    val password: String,
    val reservedAt: ZonedDateTime,
    @Convert(converter = StatusConverter::class)
    val status: Status,
    val createdAt: ZonedDateTime
)