package A_strategyPattern.client_ducks;

import A_strategyPattern.algoFly.FlyNoWay;
import A_strategyPattern.algoQuack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'am a model quack!");
    }
}
