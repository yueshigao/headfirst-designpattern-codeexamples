package D_factorypattern.aSimpleFactory;

import D_factorypattern.bFactoryMethodPattern.products.Pizza;

/**
 * v1: with Simple Pizza Factory
 **/
public class PizzaStore {

    SimplePizzaFactory factory;

    /**exactly the same as Strategy Pattern
     * 1.Injection Dependence in constructor
     * 2. delegate the create action to this dependency **/
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

         /** 2. delegate the create action to this dependency **/
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
