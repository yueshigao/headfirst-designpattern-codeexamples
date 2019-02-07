package factorypattern.b_factoryMethodPattern.creaters;

import factorypattern.b_factoryMethodPattern.products.*;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }
        if("pepperoni".equals(type)){
            pizza = new ChicagoStylePepperoniPizza();
        }
        if("clam".equals(type)){
            pizza = new ChicagoStyleClamPizza();
        }
        if("veggie".equals(type)){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
