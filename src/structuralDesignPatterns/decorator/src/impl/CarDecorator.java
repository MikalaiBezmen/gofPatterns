package structuralDesignPatterns.decorator.src.impl;

import structuralDesignPatterns.decorator.src.api.Car;

/**
 * CarDecorator.
 * Date: 01/14/2018
 *
 * @author Mikalai Bezmen
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
