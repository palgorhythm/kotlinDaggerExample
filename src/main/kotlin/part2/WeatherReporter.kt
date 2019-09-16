import javax.inject.*

class WeatherReporter @Inject constructor(private val weatherService: WeatherService, private val locationManager: LocationManager) {
    fun report() {
        println("hello from weather reporter, whose dependency is SOME weather service below...")
        weatherService.getConditions()
        locationManager.getCurrentLocation()
    }
}
