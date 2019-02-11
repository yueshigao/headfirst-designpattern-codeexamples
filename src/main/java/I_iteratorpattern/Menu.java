package I_iteratorpattern;

import java.util.Iterator;

public interface Menu {
    public Iterator createIterator();
    public void addItem(String name, String descirption, boolean vegeterian, double price);
}
