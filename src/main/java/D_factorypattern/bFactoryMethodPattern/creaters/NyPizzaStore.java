package D_factorypattern.bFactoryMethodPattern.creaters;

import D_factorypattern.Type;
import D_factorypattern.bFactoryMethodPattern.products.*;

public class NyPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (Type.CHEESE.toString().equals(type)) {
            pizza = new NyStyleCheesePizza();
        }
        if (Type.PEPPERONI.toString().equals(type)) {
            pizza = new NyStylePepperoniPizza();
        }
        if (Type.CLAM.toString().equals(type)) {
            pizza = new NyStyleClamPizza();
        }
        if (Type.VEGGIE.toString().equals(type)) {
            pizza = new NyStyleVeggiePizza();
        }
        return pizza;
    }
}
