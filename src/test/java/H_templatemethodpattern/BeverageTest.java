package H_templatemethodpattern;

import org.junit.Test;

public class BeverageTest {

    @Test
    public void should_making_beverage(){

        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("\n------Making tea-------");
        tea.prepareReceipe();

        System.out.println("\n------Making coffee-------");
        coffee.prepareReceipe();
    }

}