package A_strategyPattern.algoQuack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can not quack!");
    }
}
