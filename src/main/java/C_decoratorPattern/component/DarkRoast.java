package C_decoratorPattern.component;

public class DarkRoast extends Beverage {

    public DarkRoast(int size) {
        description = "Dark Roast Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
