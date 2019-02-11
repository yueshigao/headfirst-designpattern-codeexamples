package I_iteratorpattern.iterator;

import I_iteratorpattern.aggregate.collectionitem.MenuItem;

import java.time.LocalDateTime;
import java.util.Iterator;

/**We want to provide some items Monday, Wednesday, Friday
 * and other items Thursday, Thursday and Saturday**/
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        /**java.util.date
         * java.util.calendar
         * java.time**/
        LocalDateTime now = LocalDateTime.now();
        /**1%2=1
         2%2=0
         3%2=1
         4%2=0
         5%2=1
         6%2=0
         7%2=1
         **/
        position = now.getDayOfWeek().getValue() % 2;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        // ??
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("This menu don't doesn't support move()");
    }
}
