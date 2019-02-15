package M_compoundPattern.d_duckgoosefactory_abstractFactory;

import M_compoundPattern.a_quackable_strategy.*;
import M_compoundPattern.c_quackCount_decorator.QuackCount;

public class DuckCountFactory implements AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCount(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCaller() {
        return new QuackCount(new DuckCaller());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}
