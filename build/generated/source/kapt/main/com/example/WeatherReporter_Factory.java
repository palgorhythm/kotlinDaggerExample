package com.example;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WeatherReporter_Factory implements Factory<WeatherReporter> {
  private final Provider<WeatherService> weatherServiceProvider;

  private final Provider<LocationManager> locationManagerProvider;

  public WeatherReporter_Factory(
      Provider<WeatherService> weatherServiceProvider,
      Provider<LocationManager> locationManagerProvider) {
    this.weatherServiceProvider = weatherServiceProvider;
    this.locationManagerProvider = locationManagerProvider;
  }

  @Override
  public WeatherReporter get() {
    return new WeatherReporter(weatherServiceProvider.get(), locationManagerProvider.get());
  }

  public static Factory<WeatherReporter> create(
      Provider<WeatherService> weatherServiceProvider,
      Provider<LocationManager> locationManagerProvider) {
    return new WeatherReporter_Factory(weatherServiceProvider, locationManagerProvider);
  }
}
