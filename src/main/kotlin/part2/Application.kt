import javax.inject.*
import dagger.*

@Component(modules = [WeatherChannelModule::class, GpsSensorModule::class])
internal interface AppComponent {
    val weatherReporter: WeatherReporter
}

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        //if we're just using the WC module, it has a no-argument constructor so we can get away with just using DAC.create()
        val component = DaggerAppComponent.create()

        // if we're using the Yahoo Weather Module, we need to supply a greeting to it, so we need to instantiate it using the code below.
//        val weatherModule = YahooWeatherModule("wassup") // use these two lines for Yahoo weather module
//        val component = DaggerAppComponent.builder().yahooWeatherModule(weatherModule).build()

        val reporter = component.weatherReporter
        reporter.report()
    }
}
