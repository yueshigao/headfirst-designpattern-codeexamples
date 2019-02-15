package M_compoundPattern.d_duckgoosefactory_abstractFactory;

import M_compoundPattern.a_quackable_strategy.*;

public class DuckFactory implements AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCaller() {
        return new DuckCaller();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
