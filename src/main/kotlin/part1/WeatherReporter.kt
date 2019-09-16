package com.example

import javax.inject.*

class WeatherReporter @Inject constructor(private val weatherService: WeatherService, private val locationManager: LocationManager) {
    fun report() {
         locationManager.getCurrentLocation()
         weatherService.getConditions()
        println("Mostly clouded, 26 C\n")
    }
}
