package remoteProxy.localserver;

import remoteProxy.localserver.WeatherProxy;
import remoteProxy.remoteserver.Weather;


public class Main {
    public static void main(String[] args){
        Weather weather = new WeatherProxy();
        System.out.println(weather.getWeather());
    }
    
}