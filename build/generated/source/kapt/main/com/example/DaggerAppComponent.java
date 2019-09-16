package com.example;

import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private DaggerAppComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @Override
  public WeatherReporter getWeatherReporter() {
    return new WeatherReporter(
        new WeatherService(new Logger(), new WebSocket()),
        new LocationManager(new Logger(), new GPSProvider()));
  }

  public static final class Builder {
    private Builder() {}

    public AppComponent build() {
      return new DaggerAppComponent(this);
    }
  }
}
