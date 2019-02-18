package J_compositepattern.d_client;

import J_compositepattern.a_component.MenuComponent;
import J_compositepattern.c_leaf.aggregate.MenuItem;

import java.util.Iterator;

public class Waitress {

    public void print(MenuComponent menuComponent) {
        menuComponent.print();
    }

    public void printVegetarian(MenuComponent allMenu) {

        System.out.println("\n --------------------------");
        System.out.println("VEGETARIAN DISHES:");

        Iterator iterator = allMenu.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            /**V1: **//*
            if (menuComponent instanceof MenuItem && menuComponent.isVegetarian())
                menuComponent.print();*/

            /**V2: try catch, keep the transparency of Menu/MenuItems
             * Client don't need to know the class of menuComponent */
            try {
                if (menuComponent.isVegetarian())
                    menuComponent.print();
            } catch (UnsupportedOperationException ignored) {
            }
        }
    }
}
