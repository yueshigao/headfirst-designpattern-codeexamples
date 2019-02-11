package I_iteratorpattern.aggregate;

import I_iteratorpattern.aggregate.collectionitem.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Pancake breakfast"
                , "Pancake with egg"
                , true
                , 2.99);

        addItem("Waffles"
                ,"Waffles, with your choice of blueberries or strawberries"
                ,true
                ,3.59);
    }

    public void addItem(String name, String descirption, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, descirption, vegeterian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
