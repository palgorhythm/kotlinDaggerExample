import dagger.*

@Module
class GpsSensorModule {
    @Provides
    internal fun provideGpsSensor(): GpsSensor {
        val gps = GpsSensor()
        gps.calibrate()
        return gps
    }
}
