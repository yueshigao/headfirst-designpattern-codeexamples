package I_iteratorpattern.client;

import I_iteratorpattern.aggregate.Menu;

import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n----\nBREAKFAST");
        Iterator pancakeMenuIterator = pancakeHouseMenu.createIterator();
        printMenu(pancakeMenuIterator);

        System.out.println("\nLUNCH");
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        printMenu(dinerMenuIterator);

        System.out.println("\nDINNER");
        Iterator cafeMenuIterator = cafeMenu.createIterator();
        printMenu(cafeMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
