package A_strategyPattern;

import A_strategyPattern.client_ducks.*;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck greenDuck = new GreenHeadDuck();
        greenDuck.display();
        greenDuck.perfomeQuack();
        greenDuck.performFly();
    }
}
