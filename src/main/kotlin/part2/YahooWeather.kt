

import javax.inject.*

class YahooWeather(private val key: String, private val socket: WebSocket) : WeatherService
