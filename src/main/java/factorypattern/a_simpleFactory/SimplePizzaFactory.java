package factorypattern.a_simpleFactory;

import factorypattern.Type;
import factorypattern.b_factoryMethodPattern.products.Pizza;
import factorypattern.a_simpleFactory.products.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(Type.CHEESE.toString().equals(type)){
            pizza = new CheesePizza();
        }
        if(Type.PEPPERONI.toString().equals(type)){
            pizza = new PepperoniPizza();
        }
        if(Type.CLAM.toString().equals(type)){
            pizza = new ClamPizza();
        }
        if(Type.VEGGIE.toString().equals(type)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
