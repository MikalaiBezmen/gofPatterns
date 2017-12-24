package creationalDesignPatterns.factory.impl;

import creationalDesignPatterns.factory.api.Pizza;

/**
 * PizzaStore.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaTypeEnum pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaTypeEnum pizzaType);
}
