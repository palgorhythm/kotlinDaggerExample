package com.example

import javax.inject.*
import dagger.*

@Component
internal interface AppComponent {
    val weatherReporter: WeatherReporter
}

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        val component = DaggerAppComponent.create()
        val reporter = component.weatherReporter
        reporter.report()
    }
}
