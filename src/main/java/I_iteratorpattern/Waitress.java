package I_iteratorpattern;

import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeMenuIterator = pancakeHouseMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeMenuIterator);

        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
