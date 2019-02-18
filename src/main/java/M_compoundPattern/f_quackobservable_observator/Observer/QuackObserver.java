package M_compoundPattern.f_quackobservable_observator.Observer;

import M_compoundPattern.f_quackobservable_observator.Subject_Observable.QuackObservable;

public interface QuackObserver {
    void update(QuackObservable duck);
}
