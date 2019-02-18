package M_compoundPattern;

import M_compoundPattern.a_quackable_strategy.Quackable;
import M_compoundPattern.c_quackCount_decorator.QuackCount;
import M_compoundPattern.d_duckgoosefactory_abstractFactory.AbstractDuckFactory;
import M_compoundPattern.d_duckgoosefactory_abstractFactory.AbstractGooseFactory;
import M_compoundPattern.d_duckgoosefactory_abstractFactory.DuckCountFactory;
import M_compoundPattern.d_duckgoosefactory_abstractFactory.GooseAdapterFactory;
import M_compoundPattern.e_duckFlock_composite.Flock;
import M_compoundPattern.f_quackobservable_observator.Observer.Quackologist;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckCountFactory();
        AbstractGooseFactory gooseFactory = new GooseAdapterFactory();
        duckSimulator.simulate(duckFactory, gooseFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCaller = duckFactory.createDuckCaller();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = gooseFactory.createGooseAdapter();

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCaller);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallardDuck = new Flock();
        flockOfMallardDuck.add(mallardDuck);
        flockOfMallardDuck.add(mallardDuck);
        flockOfMallardDuck.add(mallardDuck);
        flockOfMallardDuck.add(mallardDuck);

        flockOfDucks.add(flockOfMallardDuck);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist= new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quack " + QuackCount.getQuackCount() + " times.");
    }

    /**This is the client of my Quackable strategy algorithm:
     * 1.algorithm is encapsulated in the interface implementation
     * 2.only inject the interface into client
     * 3.so the algorithm is interchangeable*/
    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
