package C_decoratorPattern;

import C_decoratorPattern.component.Beverage;
import C_decoratorPattern.component.DarkRoast;
import C_decoratorPattern.component.Espresso;
import C_decoratorPattern.decorator.Mocha;
import C_decoratorPattern.decorator.Whip;

public class cafeOrderApp {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        Beverage whipMochaDarkRoast = new Whip(new Mocha(new Mocha(darkRoast)));
        System.out.println(whipMochaDarkRoast.getDescription() + " " + whipMochaDarkRoast.cost());

    }

}
