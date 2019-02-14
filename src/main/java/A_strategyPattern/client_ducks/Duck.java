package A_strategyPattern.client_ducks;

import A_strategyPattern.algoFly.FlyBehavior;
import A_strategyPattern.algoQuack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void perfomeQuack(){
        quackBehavior.quack();
    }

    public abstract void display();
}
