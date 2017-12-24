package structuralDesignPatterns.decorator.impl;

import structuralDesignPatterns.decorator.api.Beverage;

/**
 * Espresso.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
