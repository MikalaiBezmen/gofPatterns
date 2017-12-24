package structuralDesignPatterns.decorator.impl;

import structuralDesignPatterns.decorator.api.Beverage;
import structuralDesignPatterns.decorator.api.CondimentDecorator;

/**
 * Whip.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
