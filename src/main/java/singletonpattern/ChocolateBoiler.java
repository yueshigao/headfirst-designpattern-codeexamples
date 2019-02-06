package singletonpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChocolateBoiler {

    private static final Logger LOGGER = LogManager.getLogger(ChocolateBoiler.class);

    private boolean empty;
    private boolean boiled;

    /**Si une variable n'est pas déclarée volatile,
     * chaque thread verra potentiellement une valeur différente de la variable si celle-ci change.
     * En effet, chaque thread à son propre contexte d'exécution (stack).
     * volatile concerne la VISIBILITE de la valeur d'une variable par plusieurs threads(c'est le point à retenir).
     * Si une variable est volatile tous les threads verront la nouvelle valeur de cette variable si celle-ci change.
     *
     *
     * when uniqueInstance is initiated, volatile ensures multiple thread manage correctly this instance**/
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    /**double-checked locking**/
    public static ChocolateBoiler getInstance() {

        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
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
