package I_iteratorpattern.aggregate;

import I_iteratorpattern.aggregate.collectionitem.MenuItem;
import I_iteratorpattern.iterator.*;

import java.util.Iterator;

public class DinerMenu implements Menu {

    /**
     * Array: you can control the menu size
     **/
    static final int MAX_ITEMS = 6;
    int itemNumber = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT"
                ,"Bacon with tomate"
                ,true
                ,2.99);
        addItem("Hotdog"
                ,"A hot dog, with cheese"
                ,false
                ,3.05);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    @Override
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (itemNumber >= MAX_ITEMS) {
            System.out.println("Sorry, the menu is full.");
        } else {
            menuItems[itemNumber] = menuItem;
            itemNumber ++;
        }
    }
}
