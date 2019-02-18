package M_compoundPattern.a_quackable_strategy;

import M_compoundPattern.f_quackobservable_observator.Observer.QuackObserver;
import M_compoundPattern.f_quackobservable_observator.Subject_Observable.ObservableImpl;

public class RubberDuck implements Quackable {

    ObservableImpl observable;

    public RubberDuck() {
        this.observable = new ObservableImpl(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeek");
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
