import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebSocket_Factory implements Factory<WebSocket> {
  private static final WebSocket_Factory INSTANCE = new WebSocket_Factory();

  @Override
  public WebSocket get() {
    return new WebSocket();
  }

  public static Factory<WebSocket> create() {
    return INSTANCE;
  }
}
