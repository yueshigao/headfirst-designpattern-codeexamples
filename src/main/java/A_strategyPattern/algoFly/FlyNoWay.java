package A_strategyPattern.algoFly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
