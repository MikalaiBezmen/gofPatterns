package structuralDesignPatterns.decorator.src;

import structuralDesignPatterns.decorator.src.api.Car;
import structuralDesignPatterns.decorator.src.impl.BasicCar;
import structuralDesignPatterns.decorator.src.impl.LuxuryCar;
import structuralDesignPatterns.decorator.src.impl.SportsCar;

/**
 * DecoratorMain.
 * Date: 01/14/2018
 *
 * @author Mikalai Bezmen
 */
public class DecoratorMain {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
