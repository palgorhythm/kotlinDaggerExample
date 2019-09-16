import javax.inject.*

class WebSocket @Inject constructor(){
    fun connect(){
        println("socket is connected!")
    }
}
