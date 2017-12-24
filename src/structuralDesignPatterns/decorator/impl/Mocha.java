package structuralDesignPatterns.decorator.impl;

import structuralDesignPatterns.decorator.api.Beverage;
import structuralDesignPatterns.decorator.api.CondimentDecorator;

/**
 * Mocha.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
