package M_compoundPattern.d_duckgoosefactory_abstractFactory;

import M_compoundPattern.a_quackable_strategy.Quackable;

public interface AbstractDuckFactory {

    Quackable createMallardDuck();

    Quackable createRedHeadDuck();

    Quackable createDuckCaller();

    Quackable createRubberDuck();
}
