package singletonpattern;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ChocolateBoiler {

    private static final Logger LOGGER = LogManager.getLogger(ChocolateBoiler.class);

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
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
