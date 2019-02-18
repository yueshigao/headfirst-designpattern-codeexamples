package M_compoundPattern.e_duckFlock_composite;

import M_compoundPattern.a_quackable_strategy.Quackable;
import M_compoundPattern.f_quackobservable_observator.Observer.QuackObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Composite Pattern:
 * 1. composite(Duck Flock) IS a list of component(Quackable)
 * 2. composite(Flock) and leaf(duck) both implement component
 */
public class Flock implements Quackable {

    List quakers = new ArrayList();
    //ObservableImpl observable;

    public void add(Quackable quackable) {
        quakers.add(quackable);
    }

    @Override
    public void quack() {

        Iterator iterator = quakers.iterator();

        /**Attention! in order to looping, you need to use while!!!!
         * the 1st time I've used if, so the duck flock only quack once*/
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }

    }

    @Override
    public void registerObserver(QuackObserver o) {
        Iterator iterator = quakers.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            //    observable = new ObservableImpl(quackable);
            //    observable.registerObserver(o);
            quackable.registerObserver(o);
        }
    }

    @Override
    public void notifyObservers() {
        /*Iterator iterator = quakers.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            observable = new ObservableImpl(quackable);
            observable.notifyObservers();
        }*/
    }
}
