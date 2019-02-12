package J_compositepattern.kataevaluator.composite;

import J_compositepattern.kataevaluator.Component;

import java.util.ArrayList;
import java.util.List;

public abstract class BinaryOperation extends Component {

    List values = new ArrayList();

    @Override
    public void add(Component component) {
        values.add(component);
    }

    @Override
    public void remove(Component component) {
        values.remove(component);
    }

    public Component getChild(int i) {
        return  (Component) values.get(i);
    }

}
