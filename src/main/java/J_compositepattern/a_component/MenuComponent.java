package J_compositepattern.a_component;

import java.util.Iterator;

public abstract class MenuComponent {

    /**
     * 3 "Component" methods
     **/
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * "Operation" methods
     **/
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();
}
