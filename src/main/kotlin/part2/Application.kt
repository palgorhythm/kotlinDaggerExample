import javax.inject.*
import dagger.*

@Component(modules = [WeatherChannelModule::class, GpsSensorModule::class])
internal interface AppComponent {
    val weatherReporter: WeatherReporter
}

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
//        if (args.size < 1) {
//            System.out.println("You must provide an API key\n")
//            return
//        }

//        val apiKey = args[0]
//        val yahoo = YahooWeatherModule(apiKey)
        val wc = WeatherChannelModule()

        val component = DaggerAppComponent.builder()
            .weatherChannelModule(wc)
            .build()
        val reporter = component.weatherReporter
        reporter.report()
    }
}
