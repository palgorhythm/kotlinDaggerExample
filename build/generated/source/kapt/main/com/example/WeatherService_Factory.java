package com.example;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WeatherService_Factory implements Factory<WeatherService> {
  private final Provider<Logger> loggerProvider;

  private final Provider<WebSocket> socketProvider;

  public WeatherService_Factory(
      Provider<Logger> loggerProvider, Provider<WebSocket> socketProvider) {
    this.loggerProvider = loggerProvider;
    this.socketProvider = socketProvider;
  }

  @Override
  public WeatherService get() {
    return new WeatherService(loggerProvider.get(), socketProvider.get());
  }

  public static Factory<WeatherService> create(
      Provider<Logger> loggerProvider, Provider<WebSocket> socketProvider) {
    return new WeatherService_Factory(loggerProvider, socketProvider);
  }
}
