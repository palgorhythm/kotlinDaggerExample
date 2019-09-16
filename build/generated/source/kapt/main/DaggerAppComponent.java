import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private WeatherChannelModule weatherChannelModule;

  private GpsSensorModule gpsSensorModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.weatherChannelModule = builder.weatherChannelModule;
    this.gpsSensorModule = builder.gpsSensorModule;
  }

  @Override
  public WeatherReporter getWeatherReporter() {
    return new WeatherReporter(
        Preconditions.checkNotNull(
            weatherChannelModule.provideWeatherService$daggerExample(),
            "Cannot return null from a non-@Nullable @Provides method"),
        new LocationManager(
            Preconditions.checkNotNull(
                gpsSensorModule.provideGpsSensor$daggerExample(),
                "Cannot return null from a non-@Nullable @Provides method")));
  }

  public static final class Builder {
    private WeatherChannelModule weatherChannelModule;

    private GpsSensorModule gpsSensorModule;

    private Builder() {}

    public AppComponent build() {
      if (weatherChannelModule == null) {
        this.weatherChannelModule = new WeatherChannelModule();
      }
      if (gpsSensorModule == null) {
        this.gpsSensorModule = new GpsSensorModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder weatherChannelModule(WeatherChannelModule weatherChannelModule) {
      this.weatherChannelModule = Preconditions.checkNotNull(weatherChannelModule);
      return this;
    }

    public Builder gpsSensorModule(GpsSensorModule gpsSensorModule) {
      this.gpsSensorModule = Preconditions.checkNotNull(gpsSensorModule);
      return this;
    }
  }
}
