package structuralDesignPatterns.decorator.src.impl;

import structuralDesignPatterns.decorator.src.api.Car;

/**
 * BasicCar.
 * Date: 01/14/2018
 *
 * @author Mikalai Bezmen
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
