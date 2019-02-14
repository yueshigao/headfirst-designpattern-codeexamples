package A_strategyPattern;

import A_strategyPattern.algoFly.FlyRocketPowered;
import A_strategyPattern.client_ducks.*;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck greenDuck = new GreenHeadDuck();
        greenDuck.display();
        greenDuck.perfomeQuack();
        greenDuck.performFly();

        System.out.println();
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.perfomeQuack();
        modelDuck.performFly();

        System.out.println();
        System.out.println("Change the fly behavior of the model duck:");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
