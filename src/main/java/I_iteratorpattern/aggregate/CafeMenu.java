package I_iteratorpattern.aggregate;

import I_iteratorpattern.aggregate.collectionitem.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    /**HashTable: synchronized
     * HashMap: un-synchronized**/

    Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new Hashtable<>();
        addItem("Soup of the day"
                , "with a side salad"
                , false
                , 3.69);

        addItem("Burrito"
                ,"with whole pinto beans"
                ,true
                ,4.29);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    @Override
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(),menuItem);
    }
}
