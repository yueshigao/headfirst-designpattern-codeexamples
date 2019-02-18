package M_compoundPattern.c_quackCount_decorator;

import M_compoundPattern.a_quackable_strategy.Quackable;
import M_compoundPattern.f_quackobservable_observator.Observer.QuackObserver;
import M_compoundPattern.f_quackobservable_observator.Subject_Observable.ObservableImpl;

public class QuackCount implements Quackable {

    private Quackable duck;
    private static int quackCount = 0;
    //private ObservableImpl observable;

    public QuackCount(Quackable duck) {
        this.duck = duck;
        //observable = new ObservableImpl(this);
    }

    @Override
    public void quack() {
        duck.quack();
        // can not add notifyObservers(); otherwise Observer will be notified twice
        // notify is only the real object's job
        quackCount++;
    }

    public static int getQuackCount() {
        return quackCount;
    }

    @Override
    public void registerObserver(QuackObserver o) {
      //  observable.registerObserver(o);
        duck.registerObserver(o);
    }

    @Override
    public void notifyObservers() {
       // observable.notifyObservers();
        duck.notifyObservers();
    }
}
