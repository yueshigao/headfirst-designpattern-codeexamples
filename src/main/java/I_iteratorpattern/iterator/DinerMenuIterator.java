package I_iteratorpattern.iterator;

import I_iteratorpattern.aggregate.collectionitem.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        items = list;
    }

    @Override
    public boolean hasNext() {
        /**return position < items.length && items[position] != null;**/
        if(position >= items.length || items[position] == null) return false;
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
