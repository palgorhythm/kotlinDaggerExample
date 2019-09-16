package com.example;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Logger_Factory implements Factory<Logger> {
  private static final Logger_Factory INSTANCE = new Logger_Factory();

  @Override
  public Logger get() {
    return new Logger();
  }

  public static Factory<Logger> create() {
    return INSTANCE;
  }
}
