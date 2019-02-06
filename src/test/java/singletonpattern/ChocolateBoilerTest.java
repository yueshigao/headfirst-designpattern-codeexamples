package singletonpattern;

import org.junit.jupiter.api.Test;

class ChocolateBoilerTest {

    @Test
    public void should_create_a_singleton_chocolate_boiler(){

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}