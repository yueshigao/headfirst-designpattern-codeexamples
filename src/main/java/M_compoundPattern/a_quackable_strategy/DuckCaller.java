package M_compoundPattern.a_quackable_strategy;

public class DuckCaller implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
