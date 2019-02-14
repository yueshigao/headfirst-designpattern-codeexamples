package C_decoratorPattern.decorator;

import C_decoratorPattern.component.Beverage;

/**interface decorator extends component to get the right type*/
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
