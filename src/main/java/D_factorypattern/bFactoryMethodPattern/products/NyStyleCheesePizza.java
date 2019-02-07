package D_factorypattern.bFactoryMethodPattern.products;

public class NyStyleCheesePizza extends Pizza {

    /**1.upper class' fields should be called in constructor,
     * could use fields of upper class directly (magic!!)
     * 2.if fields defined out of constructor,
     * that will have no relation with upper class*/

    public NyStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
