package E_singletonpattern;


import org.junit.Test;

public class ChocolateBoilerTest {

    @Test
    public void should_create_a_singleton_chocolate_boiler(){

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.fill();
        chocolateBoiler.drain();


    }
}