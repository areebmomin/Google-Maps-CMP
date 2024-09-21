package com.areeb.googlemapscmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform