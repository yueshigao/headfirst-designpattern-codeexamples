package factorypattern.z_baddependencypizzastore;

import factorypattern.b_factoryMethodPattern.products.Pizza;
import factorypattern.a_simpleFactory.products.*;

/**Bad dependency: PizzaStore depends on pizzas' implementation(see new())
 * => upper component(PizzaStore) depends on lower components(pizzas)
 * need Dependency Inversion Principle DIP:
 * upper component(PizzaStore) should not depends on lower components(pizzas)
 * and they should all depends on abstracts (pizza) */

public class PizzaStore {
    public Pizza orderPizza(String type){

        Pizza pizza = null;

        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }
        if("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }
        if("clam".equals(type)){
            pizza = new ClamPizza();
        }
        if("veggie".equals(type)){
           pizza = new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
