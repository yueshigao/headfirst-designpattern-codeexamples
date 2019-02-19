package J_compositepattern.b_compositeNode.aggregate;

import J_compositepattern.a_component.MenuComponent;
import J_compositepattern.b_compositeNode.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    List<MenuComponent> menuComponents = new ArrayList();

    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**Pay attention: add to my menu list**/
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        MenuComponent child = (MenuComponent)menuComponents.get(i);
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
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------------");

        /**V1: steam(), java 8*/
        menuComponents.stream().forEach(MenuComponent::print);

        /**V2: for each, java 5
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }*/

        /**V3: Iterator
         * Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }*/
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
