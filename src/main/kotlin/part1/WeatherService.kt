package com.example

import javax.inject.*

class WeatherService @Inject constructor(private val logger: Logger, private val socket: WebSocket){
    fun getConditions(){
        println("got conditions from weather service!!")
    }
}
