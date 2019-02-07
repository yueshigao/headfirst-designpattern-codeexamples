package D_factorypattern.bFactoryMethodPattern;

import D_factorypattern.Type;
import D_factorypattern.bFactoryMethodPattern.products.Pizza;
import D_factorypattern.bFactoryMethodPattern.creaters.ChicagoPizzaStore;
import D_factorypattern.bFactoryMethodPattern.creaters.NyPizzaStore;
import D_factorypattern.bFactoryMethodPattern.creaters.PizzaStore;

public class MyOrder {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        String type = Type.CHEESE.toString();
        Pizza nyPizza = nyPizzaStore.orderPizza(type);
        System.out.println("Jack ordered a " + nyPizza.getName() + "\n");

        Pizza chicagoPizza = chicagoPizzaStore.orderPizza(type);
        System.out.println("Rose ordered a " + chicagoPizza.getName() + "\n");
    }
}
