package com.example.maddehlib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform