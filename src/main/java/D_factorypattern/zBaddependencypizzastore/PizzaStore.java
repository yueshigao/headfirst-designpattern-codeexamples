package D_factorypattern.zBaddependencypizzastore;

import D_factorypattern.Type;
import D_factorypattern.aSimpleFactory.products.CheesePizza;
import D_factorypattern.aSimpleFactory.products.ClamPizza;
import D_factorypattern.aSimpleFactory.products.PepperoniPizza;
import D_factorypattern.aSimpleFactory.products.VeggiePizza;
import D_factorypattern.bFactoryMethodPattern.products.Pizza;

/**1.Bad dependency: PizzaStore depends on pizzas' implementation(see new())
 * => upper component(PizzaStore) depends on lower components(pizzas)
 * 2.need Dependency Inversion Principle DIP:
 * upper component(PizzaStore) should not depends on lower components(pizzas)
 * and they should all depends on abstracts (pizza) */

public class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza = new Pizza() {
            @Override
            public void prepare() {
                super.prepare();
            }

            @Override
            public void bake() {
                super.bake();
            }

            @Override
            public void cut() {
                super.cut();
            }

            @Override
            public void box() {
                super.box();
            }

            @Override
            public String getName() {
                return super.getName();
            }
        };

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

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
