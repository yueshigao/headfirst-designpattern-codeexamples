package factorypattern.b_factoryMethodPattern;

import factorypattern.Type;
import factorypattern.b_factoryMethodPattern.products.Pizza;
import factorypattern.b_factoryMethodPattern.creaters.ChicagoPizzaStore;
import factorypattern.b_factoryMethodPattern.creaters.NyPizzaStore;
import factorypattern.b_factoryMethodPattern.creaters.PizzaStore;

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
