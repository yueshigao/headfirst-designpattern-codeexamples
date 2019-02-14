package C_decoratorPattern.component;

public abstract class Beverage {

    String description = "Unknow beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
