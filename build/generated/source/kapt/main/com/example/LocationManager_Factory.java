package com.example;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LocationManager_Factory implements Factory<LocationManager> {
  private final Provider<Logger> loggerProvider;

  private final Provider<GPSProvider> gpsProvider;

  public LocationManager_Factory(
      Provider<Logger> loggerProvider, Provider<GPSProvider> gpsProvider) {
    this.loggerProvider = loggerProvider;
    this.gpsProvider = gpsProvider;
  }

  @Override
  public LocationManager get() {
    return new LocationManager(loggerProvider.get(), gpsProvider.get());
  }

  public static Factory<LocationManager> create(
      Provider<Logger> loggerProvider, Provider<GPSProvider> gpsProvider) {
    return new LocationManager_Factory(loggerProvider, gpsProvider);
  }
}
