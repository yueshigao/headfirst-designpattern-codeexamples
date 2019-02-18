package M_compoundPattern.f_quackobservable_observator.Subject_Observable;

import M_compoundPattern.f_quackobservable_observator.Observer.QuackObserver;

public interface QuackObservable  {

    void registerObserver(QuackObserver o);
    void notifyObservers();
}
