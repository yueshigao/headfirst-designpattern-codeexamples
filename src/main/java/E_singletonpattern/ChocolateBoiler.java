package E_singletonpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**Lazy instantiation*/
public class ChocolateBoiler {

    private static final Logger LOGGER = LogManager.getLogger(ChocolateBoiler.class);

    private boolean empty;
    private boolean boiled;

    /**
     * volatile: concerne la VISIBILITE de la valeur d'une variable par plusieurs threads.
     * Thread: En effet, chaque thread à son propre contexte d'exécution (stack).
     * volatile variable changed: tous les threads verront la nouvelle valeur de cette variable (here: uniqueInstance)
     * non-volatile variable changed: chaque thread verra potentiellement une valeur différente de la variable
     **/
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    /**
     * double-checked locking
     * advantage 1: synchronized block only execute 1st time, instead synchronized getInstance()(synchronized all the time)
     * advantage 2: lazy instantiation (instance when needed), instead uniqueInstance = new xx()(Eager instantiation, if variable not needed in this execution, a waste)
     **/
    public static ChocolateBoiler getInstance() {
        /**1st check: only entry into the synchronized block when not null **/
        if (uniqueInstance == null) {
            /**synchronized block only execute 1st time: performance+**/
            synchronized (ChocolateBoiler.class) {
                /**2nd check: if null, initiate -- lazy instantiation (instance when needed)**/
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            LOGGER.info("Fill the boiler if empty");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            LOGGER.info("Drain the boiler if not empty and already boiled");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            LOGGER.info("Boil the boiler if not empty and not boiled");
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
