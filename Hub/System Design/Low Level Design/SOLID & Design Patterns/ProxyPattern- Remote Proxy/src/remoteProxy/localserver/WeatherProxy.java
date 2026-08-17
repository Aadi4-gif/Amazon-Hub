package remoteProxy.localserver;

import remoteProxy.remoteserver.Weather;
import remoteProxy.remoteserver.WeatherService;

public class WeatherProxy implements Weather{
    private Weather weather;

    public WeatherProxy() {
        this.weather = new WeatherService();
    }

    @Override
    public String getWeather() {
        authenticate();
        openConnection();
        serialRequest();

        return sendHttpRequest();
    }

    private void authenticate(){
        System.out.println("Authenticating...");
    }

    private void openConnection(){
        System.out.println("Opening Connections...");
    }

    private void serialRequest(){
        System.out.println("Serializing Request...");
    }

    private String sendHttpRequest(){
        System.out.println("Sending Http Request...");
        return weather.getWeather();
    }
}
