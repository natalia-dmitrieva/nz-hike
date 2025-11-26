package com.example.nzhike

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform