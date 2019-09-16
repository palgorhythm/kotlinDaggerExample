package com.example;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GPSProvider_Factory implements Factory<GPSProvider> {
  private static final GPSProvider_Factory INSTANCE = new GPSProvider_Factory();

  @Override
  public GPSProvider get() {
    return new GPSProvider();
  }

  public static Factory<GPSProvider> create() {
    return INSTANCE;
  }
}
