package factorypattern.z_baddependencypizzastore;

import factorypattern.Type;
import factorypattern.a_simpleFactory.products.CheesePizza;
import factorypattern.a_simpleFactory.products.ClamPizza;
import factorypattern.a_simpleFactory.products.PepperoniPizza;
import factorypattern.a_simpleFactory.products.VeggiePizza;
import factorypattern.b_factoryMethodPattern.products.Pizza;

/**1.Bad dependency: PizzaStore depends on pizzas' implementation(see new())
 * => upper component(PizzaStore) depends on lower components(pizzas)
 * 2.need Dependency Inversion Principle DIP:
 * upper component(PizzaStore) should not depends on lower components(pizzas)
 * and they should all depends on abstracts (pizza) */

public class PizzaStore {

    public Pizza orderPizza(String type){

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

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }
}
