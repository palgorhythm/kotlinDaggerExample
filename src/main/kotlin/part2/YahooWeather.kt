

import javax.inject.*

class YahooWeather(private val greeting: String, private val socket: WebSocket) : WeatherService{
    override fun getConditions(){
        socket.connect()
        println("yahoo says ${greeting}! the weather is great")
    }
}
