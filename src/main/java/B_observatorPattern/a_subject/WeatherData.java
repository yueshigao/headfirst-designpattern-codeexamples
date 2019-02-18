package B_observatorPattern.a_subject;

import B_observatorPattern.b_observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<WeatherObserver> weatherObservers = new ArrayList<>();
    private float temperature;
    private float humility;
    private float pressure;

    public void setWeatherData(float temperature, float humility, float pressure){
        this.temperature=temperature;
        this.humility=humility;
        this.pressure=pressure;
        weatherDataChanged();
    }

    private void weatherDataChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        int i = weatherObservers.indexOf(weatherObserver);
        weatherObservers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.update(temperature, humility, pressure );
        }
    }
}
