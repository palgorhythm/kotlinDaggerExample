import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class YahooWeatherModule_ProvideWeatherService$daggerExampleFactory
    implements Factory<WeatherService> {
  private final YahooWeatherModule module;

  private final Provider<WebSocket> socketProvider;

  public YahooWeatherModule_ProvideWeatherService$daggerExampleFactory(
      YahooWeatherModule module, Provider<WebSocket> socketProvider) {
    this.module = module;
    this.socketProvider = socketProvider;
  }

  @Override
  public WeatherService get() {
    return Preconditions.checkNotNull(
        module.provideWeatherService$daggerExample(socketProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WeatherService> create(
      YahooWeatherModule module, Provider<WebSocket> socketProvider) {
    return new YahooWeatherModule_ProvideWeatherService$daggerExampleFactory(
        module, socketProvider);
  }
}
