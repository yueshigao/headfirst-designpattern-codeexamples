package D_factorypattern.aSimpleFactory;

import D_factorypattern.bFactoryMethodPattern.products.Pizza;

/**
 * v1: with Simple Pizza Factory
 **/
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
