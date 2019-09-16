import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WeatherChannelModule_ProvideWeatherService$daggerExampleFactory
    implements Factory<WeatherService> {
  private final WeatherChannelModule module;

  public WeatherChannelModule_ProvideWeatherService$daggerExampleFactory(
      WeatherChannelModule module) {
    this.module = module;
  }

  @Override
  public WeatherService get() {
    return Preconditions.checkNotNull(
        module.provideWeatherService$daggerExample(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WeatherService> create(WeatherChannelModule module) {
    return new WeatherChannelModule_ProvideWeatherService$daggerExampleFactory(module);
  }
}
