package J_compositepattern;

import J_compositepattern.a_component.MenuComponent;
import J_compositepattern.b_compositeNode.aggregate.Menu;
import J_compositepattern.c_leaf.aggregate.MenuItem;
import J_compositepattern.d_client.Waitress;

public class MenuOrder {

    public static void main(String[] args) {

        // 1. Breakfast Menu
        MenuComponent breakfastMenu = buildBreakfastMenu();

        // 2. Lunch with dessert Menu
        MenuComponent dessertMenu = buildDessertMenu();
        MenuComponent lunchMenu = buildLunchMenu(dessertMenu);

        // 3. Dinner Menu
        MenuComponent dinnerMenu = buildDinnerMenu();

        // 4. All Menus
        MenuComponent allMenus =
                new Menu("ALL MENUS", "All Menu Combined");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        // Z-1: print all
        Waitress waitress = new Waitress();
        waitress.print(allMenus);

        // Z-2: print a part
        waitress.print(dessertMenu);

        // Z-3: iterate all menus, and pick the vegetarian items
        waitress.printVegetarian(allMenus);
    }

    private static MenuComponent buildDinnerMenu() {

        MenuComponent dinnerMenu = new Menu("CAFE MENU", "Diner");
        dinnerMenu.add(new MenuItem("Soup of the day"
                , "with a side salad"
                , false
                , 3.69));

        dinnerMenu.add(new MenuItem("Burrito"
                , "with whole pinto beans"
                , true
                , 4.29));
        return dinnerMenu;
    }

    private static MenuComponent buildLunchMenu(MenuComponent dessertMenu) {

        MenuComponent lunchMenu = new Menu("LUNCH MENU", "Lunch");
        lunchMenu.add(new MenuItem("Vegetarian BLT"
                , "Bacon with tomate"
                , true
                , 2.99));
        lunchMenu.add(new MenuItem("Hotdog"
                , "A hot dog, with cheese"
                , false
                , 3.05));
        lunchMenu.add(dessertMenu);
        return lunchMenu;
    }

    private static MenuComponent buildDessertMenu() {
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        dessertMenu.add(new MenuItem("Apple pie"
                , "with ice cream"
                , true
                , 1.59));
        dessertMenu.add(new MenuItem("Cheese cake"
                , "with a chocolate graham crust"
                , true
                , 1.99));
        return dessertMenu;
    }

    private static MenuComponent buildBreakfastMenu() {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        pancakeHouseMenu.add(new MenuItem("Pancake breakfast"
                , "Pancake with egg"
                , true
                , 2.99));
        pancakeHouseMenu.add(new MenuItem("Waffles"
                , "Waffles, with your choice of blueberries or strawberries"
                , true
                , 3.59));
        return pancakeHouseMenu;
    }
}
