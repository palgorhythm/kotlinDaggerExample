import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WeatherChannel_Factory implements Factory<WeatherChannel> {
  private static final WeatherChannel_Factory INSTANCE = new WeatherChannel_Factory();

  @Override
  public WeatherChannel get() {
    return new WeatherChannel();
  }

  public static Factory<WeatherChannel> create() {
    return INSTANCE;
  }
}
