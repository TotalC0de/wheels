package com.example.wheels

data class WeatherResponse(
    val main: Main
)

data class Main(
    val temp: Float
)
