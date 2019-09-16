import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LocationManager_Factory implements Factory<LocationManager> {
  private final Provider<GpsSensor> gpsProvider;

  public LocationManager_Factory(Provider<GpsSensor> gpsProvider) {
    this.gpsProvider = gpsProvider;
  }

  @Override
  public LocationManager get() {
    return new LocationManager(gpsProvider.get());
  }

  public static Factory<LocationManager> create(Provider<GpsSensor> gpsProvider) {
    return new LocationManager_Factory(gpsProvider);
  }
}
