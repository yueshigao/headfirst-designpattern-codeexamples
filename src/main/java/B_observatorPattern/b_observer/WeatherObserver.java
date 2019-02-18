package B_observatorPattern.b_observer;

public interface WeatherObserver {
    void update(float temperature, float humility, float pressure);
}
