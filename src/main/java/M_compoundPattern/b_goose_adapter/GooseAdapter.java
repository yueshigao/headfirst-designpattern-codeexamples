package M_compoundPattern.b_goose_adapter;

import M_compoundPattern.a_quackable_strategy.Quackable;
import M_compoundPattern.f_quackobservable_observator.Observer.QuackObserver;
import M_compoundPattern.f_quackobservable_observator.Subject_Observable.ObservableImpl;

public class GooseAdapter implements Quackable {

    private Goose goose;
    private ObservableImpl observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new ObservableImpl(this);
    }

    @Override
    public void quack() {
        goose.honk();
        // can not add notifyObservers(); otherwise Observer will be notified twice
        // notify is only the real object's job
    }

    @Override
    public void registerObserver(QuackObserver o) {
        observable.registerObserver(o);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Goose pretending to be a Duck";
    }
}
