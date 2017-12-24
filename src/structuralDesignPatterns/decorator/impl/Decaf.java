package structuralDesignPatterns.decorator.impl;

import structuralDesignPatterns.decorator.api.Beverage;

/**
 * Decaf.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class Decaf extends Beverage {

    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
