package structuralDesignPatterns.decorator.impl;

import structuralDesignPatterns.decorator.api.Beverage;

/**
 * HouseBlend.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend");
    }

    @Override
    public double cost() {
        return .89;
    }
}
