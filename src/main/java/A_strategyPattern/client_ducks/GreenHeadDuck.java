package A_strategyPattern.client_ducks;

import A_strategyPattern.algoFly.FlyWithWings;
import A_strategyPattern.algoQuack.Quack;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a green head duck!");
    }
}
