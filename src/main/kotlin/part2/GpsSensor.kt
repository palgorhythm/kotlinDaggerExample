class GpsSensor {
    private var calibrated : Boolean = false
    fun getPosition() {
        if(calibrated) println("getting our position from the GPS sensor! this is a THIRD PARTY class")
    }
    fun calibrate(){
        calibrated = true
    }
}
