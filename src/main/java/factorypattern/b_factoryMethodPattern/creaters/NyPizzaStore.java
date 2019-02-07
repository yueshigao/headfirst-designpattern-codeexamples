package factorypattern.b_factoryMethodPattern.creaters;

import factorypattern.b_factoryMethodPattern.products.*;

public class NyPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NyStyleCheesePizza();
        }
        if ("pepperoni".equals(type)) {
            pizza = new NyStylePepperoniPizza();
        }
        if ("clam".equals(type)) {
            pizza = new NyStyleClamPizza();
        }
        if ("veggie".equals(type)) {
            pizza = new NyStyleVeggiePizza();
        }
        return pizza;
    }
}
