package com.yhrsv.reservation_system.model

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

enum class Status(val code: String) {
    ACTIVE("A"),
    DELETED("D");

    companion object {
        fun findByCode(code: String) = entries.find { it.code == code }
    }
}

@Converter
class StatusConverter: AttributeConverter<Status, String> {
    override fun convertToDatabaseColumn(attribute: Status?): String? {
        return attribute?.code
    }

    override fun convertToEntityAttribute(dbData: String?): Status? {
        return dbData?.let { Status.findByCode(it) }
    }
}