package E_singletonpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**Eager instantiation*/
public class ChocolateBoiler_Eager {

    private static final Logger LOGGER = LogManager.getLogger(ChocolateBoiler_Eager.class);

    private boolean empty;
    private boolean boiled;

    //instance directly the static field of instance
    private static ChocolateBoiler_Eager uniqueInstance = new ChocolateBoiler_Eager();

    private ChocolateBoiler_Eager() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler_Eager getInstance() {
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
