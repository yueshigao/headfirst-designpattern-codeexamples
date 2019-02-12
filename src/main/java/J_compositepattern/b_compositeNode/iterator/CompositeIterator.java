package J_compositepattern.b_compositeNode.iterator;

import J_compositepattern.a_component.MenuComponent;
import J_compositepattern.b_compositeNode.aggregate.Menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }
        return null;
    }

    @Override
    public boolean hasNext() {

        if (stack.empty()) return false;

        /**if not empty, check the peek Iterator**/
        Iterator peekIterator = (Iterator) stack.peek();
        if (!peekIterator.hasNext()) {
            stack.pop();
            return false;
        }

        return true;
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
