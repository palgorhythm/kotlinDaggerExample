import javax.inject.*

class LocationManager @Inject constructor(private val gps: GpsSensor){
    fun getCurrentLocation(){
        gps.getPosition()
    }
}
