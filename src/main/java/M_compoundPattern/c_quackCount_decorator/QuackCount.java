package M_compoundPattern.c_quackCount_decorator;

import M_compoundPattern.a_quackable_strategy.Quackable;

public class QuackCount implements Quackable{

    private Quackable duck;
    private static int quackCount = 0;

    public QuackCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public static int getQuackCount() {
        return quackCount;
    }
}
