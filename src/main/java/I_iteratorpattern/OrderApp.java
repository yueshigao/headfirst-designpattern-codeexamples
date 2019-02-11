package I_iteratorpattern;

import I_iteratorpattern.aggregate.CafeMenu;
import I_iteratorpattern.aggregate.DinerMenu;
import I_iteratorpattern.aggregate.Menu;
import I_iteratorpattern.aggregate.PancakeHouseMenu;
import I_iteratorpattern.client.Waitress;

public class OrderApp {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
