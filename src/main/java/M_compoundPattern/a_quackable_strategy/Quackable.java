package M_compoundPattern.a_quackable_strategy;

import M_compoundPattern.f_quackobservable_observator.Subject_Observable.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
