package structuralDesignPatterns.decorator.impl;

import structuralDesignPatterns.decorator.api.Beverage;

/**
 * DarkRoast.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return .99;
    }
}
