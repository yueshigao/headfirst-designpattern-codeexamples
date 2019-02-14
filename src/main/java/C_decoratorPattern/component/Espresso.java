package C_decoratorPattern.component;

public class Espresso extends Beverage {

    public Espresso(int size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
