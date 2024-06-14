package com.yhrsv.reservation_system.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/api/sample")
    fun sample(): String {
        val twoMinusOne = 2 - 1
        return "sample"
    }
}