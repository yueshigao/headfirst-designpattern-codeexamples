package D_factorypattern.bFactoryMethodPattern.creaters;

import D_factorypattern.Type;
import D_factorypattern.bFactoryMethodPattern.products.*;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(Type.CHEESE.toString().equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }
        if(Type.PEPPERONI.equals(type)){
            pizza = new ChicagoStylePepperoniPizza();
        }
        if(Type.CLAM.toString().equals(type)){
            pizza = new ChicagoStyleClamPizza();
        }
        if(Type.VEGGIE.toString().equals(type)){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
