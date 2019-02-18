package B_observatorPattern.b_observer;

import B_observatorPattern.a_subject.WeatherData;

public class CurrentConditionDisplay implements WeatherObserver, DisplayElement {

    WeatherData weatherData;
    float temperature;
    float humility;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humility, float pressure) {
        this.temperature = temperature;
        this.humility = humility;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temperature + " Humility: " + humility);
    }
}
