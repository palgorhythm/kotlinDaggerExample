package com.example

import javax.inject.*

class LocationManager @Inject constructor(private val logger: Logger, private val gpsProvider: GPSProvider){
    fun getCurrentLocation(){
        println("GOT THE CURRENT LOCATION from location manager")
    }
}
