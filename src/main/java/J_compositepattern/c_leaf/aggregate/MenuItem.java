package J_compositepattern.c_leaf.aggregate;

import J_compositepattern.a_component.MenuComponent;
import J_compositepattern.c_leaf.iterator.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(){
        System.out.print(" " + getName());
        if(isVegetarian()) System.out.print("(v)");
        System.out.print(", " + getPrice() + "€");
        System.out.println(" --" + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
