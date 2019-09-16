
import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"LYahooWeatherModule;", "", "greeting", "", "(Ljava/lang/String;)V", "provideWeatherService", "LWeatherService;", "socket", "LWebSocket;", "provideWeatherService$daggerExample", "daggerExample"})
@dagger.Module()
public final class YahooWeatherModule {
    private final java.lang.String greeting = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final WeatherService provideWeatherService$daggerExample(@org.jetbrains.annotations.NotNull()
    WebSocket socket) {
        return null;
    }
    
    public YahooWeatherModule(@org.jetbrains.annotations.NotNull()
    java.lang.String greeting) {
        super();
    }
}