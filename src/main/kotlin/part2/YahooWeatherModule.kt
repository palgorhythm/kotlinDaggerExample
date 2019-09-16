import dagger.*

@Module
class YahooWeatherModule(private val key: String) {

    @Provides
    internal fun provideWeatherService(socket: WebSocket): WeatherService {
        return YahooWeather(key, socket)
    }
}

