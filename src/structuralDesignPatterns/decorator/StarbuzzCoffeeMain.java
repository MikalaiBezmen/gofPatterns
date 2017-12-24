package structuralDesignPatterns.decorator;

import structuralDesignPatterns.decorator.api.Beverage;
import structuralDesignPatterns.decorator.impl.Espresso;
import structuralDesignPatterns.decorator.impl.HouseBlend;
import structuralDesignPatterns.decorator.impl.Mocha;
import structuralDesignPatterns.decorator.impl.Soy;
import structuralDesignPatterns.decorator.impl.Whip;

/**
 * StarbuzzCoffeeMain.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class StarbuzzCoffeeMain {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
