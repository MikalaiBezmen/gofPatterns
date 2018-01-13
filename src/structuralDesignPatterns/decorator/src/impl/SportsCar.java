package structuralDesignPatterns.decorator.src.impl;

import structuralDesignPatterns.decorator.src.api.Car;

/**
 * SportsCar.
 * Date: 01/14/2018
 *
 * @author Mikalai Bezmen
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
