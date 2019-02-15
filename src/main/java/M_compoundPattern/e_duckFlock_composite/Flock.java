package M_compoundPattern.e_duckFlock_composite;

import M_compoundPattern.a_quackable_strategy.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**Composite Pattern:
 * 1. composite(Duck Flock) IS a list of component(Quackable)
 * 2. composite(Flock) and leaf(duck) both implement component*/
public class Flock implements Quackable {

    List quakers = new ArrayList();

    public void add(Quackable quackable){
        quakers.add(quackable);
    }

    @Override
    public void quack() {

        Iterator iterator = quakers.iterator();

        /**Attention! in order to looping, you need to use while!!!!
         * the 1st time I've used if, so the duck flock only quack once*/
        while(iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }

    }
}
