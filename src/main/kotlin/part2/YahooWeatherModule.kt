import dagger.*

@Module
class YahooWeatherModule(private val greeting: String) {

    @Provides
    internal fun provideWeatherService(socket: WebSocket): WeatherService {
        // the input to provideWeatherService is auto instantiated and passed to YahooWeather when this module is provided to the app
        return YahooWeather(greeting, socket)
    }
}

