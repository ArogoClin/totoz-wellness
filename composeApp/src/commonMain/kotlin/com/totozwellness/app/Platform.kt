package com.totozwellness.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform