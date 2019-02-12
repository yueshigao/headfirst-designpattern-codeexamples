package J_compositepattern;

import J_compositepattern.a_component.MenuComponent;
import J_compositepattern.b_compositeNode.Menu;
import J_compositepattern.c_leaf.MenuItem;
import J_compositepattern.d_client.Waitress;

public class MenuOrder {

    public static void main(String[] args) {

        //0.1 all menus list
        MenuComponent allMenus = new Menu("ALL MENUS", "All Menu Combined");
        //0.2 client
        Waitress waitress = new Waitress(allMenus);

        //1.1 create and add breakfast menu into the menu list
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        allMenus.add(pancakeHouseMenu);

        //1.2 add menu items into breakfast menu
        pancakeHouseMenu.add(new MenuItem("Pancake breakfast"
                , "Pancake with egg"
                , true
                , 2.99));
        pancakeHouseMenu.add(new MenuItem("Waffles"
                , "Waffles, with your choice of blueberries or strawberries"
                , true
                , 3.59));

        //2.1 lunch menu
        MenuComponent lunchMenu = new Menu("LUNCH MENU", "Lunch");
        allMenus.add(lunchMenu);

        //2.2 lunch menu : menu items
        lunchMenu.add(new MenuItem("Vegetarian BLT"
                , "Bacon with tomate"
                , true
                , 2.99));
        lunchMenu.add(new MenuItem("Hotdog"
                , "A hot dog, with cheese"
                , false
                , 3.05));

        //2.3 lunch menu: dessert menu
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        lunchMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple pie"
                , "with ice cream"
                , true
                , 1.59));
        dessertMenu.add(new MenuItem("Cheese cake"
                , "with a chocolate graham crust"
                , true
                , 1.99));

        //3 dinner menu
        MenuComponent dinnerMenu = new Menu("CAFE MENU","Diner");
        allMenus.add(dinnerMenu);

        dinnerMenu.add(new MenuItem("Soup of the day"
                , "with a side salad"
                , false
                , 3.69));

        dinnerMenu.add(new MenuItem("Burrito"
                ,"with whole pinto beans"
                ,true
                ,4.29));

        //Z print
        waitress.print();

    }
}
