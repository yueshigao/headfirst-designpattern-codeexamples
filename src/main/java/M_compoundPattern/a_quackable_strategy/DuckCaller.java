package M_compoundPattern.a_quackable_strategy;

import M_compoundPattern.f_quackobservable_observator.Observer.QuackObserver;
import M_compoundPattern.f_quackobservable_observator.Subject_Observable.ObservableImpl;

public class DuckCaller implements Quackable {

    ObservableImpl observable;

    public DuckCaller() {
        this.observable = new ObservableImpl(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver o) {
        observable.registerObserver(o);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
