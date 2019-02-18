package M_compoundPattern.f_quackobservable_observator.Subject_Observable;

import M_compoundPattern.f_quackobservable_observator.Observer.QuackObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObservableImpl implements QuackObservable {

    List observers = new ArrayList();
    QuackObservable duck;

    public ObservableImpl(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(QuackObserver o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            QuackObserver quackObserver = (QuackObserver) iterator.next();
            quackObserver.update(duck);
        }
    }
}
