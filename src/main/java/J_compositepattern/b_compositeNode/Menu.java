package J_compositepattern.b_compositeNode;

import J_compositepattern.a_component.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Menu extends MenuComponent {
    ArrayList menuComponets = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponent.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(MenuComponent menuComponent) {
        MenuComponent child = menuComponent.getChild(menuComponent);
        return child;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------------");

        Iterator iterator = menuComponets.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }


}
