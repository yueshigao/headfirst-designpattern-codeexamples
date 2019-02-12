package J_compositepattern.d_client;

import J_compositepattern.a_component.MenuComponent;
import J_compositepattern.c_leaf.aggregate.MenuItem;

import java.util.Iterator;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print(){
        allMenus.print();
    }

    public void printVegetarian() {
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof MenuItem && menuComponent.isVegetarian())
                menuComponent.print();
        }
    }
}
