package structuralDesignPatterns.decorator.impl;

import structuralDesignPatterns.decorator.api.Beverage;
import structuralDesignPatterns.decorator.api.CondimentDecorator;

/**
 * Soy.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
