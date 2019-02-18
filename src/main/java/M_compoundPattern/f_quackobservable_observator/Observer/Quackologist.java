package M_compoundPattern.f_quackobservable_observator.Observer;

import M_compoundPattern.f_quackobservable_observator.Subject_Observable.QuackObservable;

public class Quackologist implements QuackObserver {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
