package C_decoratorPattern;

import C_decoratorPattern.component.Beverage;
import C_decoratorPattern.component.DarkRoast;
import C_decoratorPattern.component.Espresso;
import C_decoratorPattern.decorator.Mocha;
import C_decoratorPattern.decorator.Whip;

public class cafeOrderApp {

    public static void main(String[] args) {

        Beverage espresso = new Espresso(1);
        System.out.println(espresso.getDescription() + " " + espresso.cost());

        Beverage whipEspresso = new Whip(espresso);
        System.out.println(whipEspresso.getDescription()+" "+whipEspresso.cost());

        Beverage darkRoast = new DarkRoast(2);
        Mocha beverage = new Mocha(new Mocha(darkRoast));
        Beverage whipMochaDarkRoast = new Whip(beverage);
        System.out.println(whipMochaDarkRoast.getDescription() + " " + whipMochaDarkRoast.cost());
    }

}
