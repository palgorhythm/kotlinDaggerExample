import dagger.*

@Module
class WeatherChannelModule {
    @Provides
    internal fun provideWeatherService(): WeatherService {
        return WeatherChannel()
    }
}
