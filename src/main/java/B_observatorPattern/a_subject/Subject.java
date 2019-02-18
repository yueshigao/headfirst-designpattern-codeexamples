package B_observatorPattern.a_subject;

import B_observatorPattern.b_observer.WeatherObserver;

public interface Subject {

    void registerObserver(WeatherObserver weatherObserver);

    void removeObserver(WeatherObserver weatherObserver);

    void notifyObservers();

}
