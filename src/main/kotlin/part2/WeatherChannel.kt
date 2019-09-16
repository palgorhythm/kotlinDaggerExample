import javax.inject.*

class WeatherChannel @Inject constructor() : WeatherService{
    override fun getConditions(){
        println("weather channel says hello! the weather is pretty ok")
    }
}
