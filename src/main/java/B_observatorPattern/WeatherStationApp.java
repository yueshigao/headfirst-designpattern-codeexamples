package B_observatorPattern;

import B_observatorPattern.a_subject.WeatherData;
import B_observatorPattern.b_observer.CurrentConditionDisplay;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setWeatherData(11,2,9);
        weatherData.setWeatherData(0,2,9);

    }
}
