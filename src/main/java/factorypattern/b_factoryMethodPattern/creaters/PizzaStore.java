package factorypattern.b_factoryMethodPattern.creaters;

import factorypattern.b_factoryMethodPattern.products.Pizza;

/**v2: abstract method pattern,
 * when PizzaStore's subclass need their own factory
 * ex. NyPizzaStore create pizzas with NYer style**/

public abstract class PizzaStore {

    /**
     * Changes 1. delete SimplePizzaFactory factory;
    */

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * Changes 2. abstract method;
    */
    abstract Pizza createPizza(String type);
}
