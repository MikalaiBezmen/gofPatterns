package structuralDesignPatterns.decorator.src.impl;

import structuralDesignPatterns.decorator.src.api.Car;

/**
 * LuxuryCar.
 * Date: 01/14/2018
 *
 * @author Mikalai Bezmen
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
