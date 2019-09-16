import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GpsSensorModule_ProvideGpsSensor$daggerExampleFactory
    implements Factory<GpsSensor> {
  private final GpsSensorModule module;

  public GpsSensorModule_ProvideGpsSensor$daggerExampleFactory(GpsSensorModule module) {
    this.module = module;
  }

  @Override
  public GpsSensor get() {
    return Preconditions.checkNotNull(
        module.provideGpsSensor$daggerExample(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GpsSensor> create(GpsSensorModule module) {
    return new GpsSensorModule_ProvideGpsSensor$daggerExampleFactory(module);
  }
}
