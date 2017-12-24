package creationalDesignPatterns.factory.impl.pizza;

import creationalDesignPatterns.factory.api.IPizzaIngredientFactory;
import creationalDesignPatterns.factory.api.Pizza;

/**
 * VeggiePizza.
 * Date: 07/20/2017
 *
 * @author Mikalai Bezmen
 */
public class VeggiePizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public VeggiePizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setVeggies(ingredientFactory.createVeggies());
    }

    public IPizzaIngredientFactory getIngredientFactory() {
        return ingredientFactory;
    }

    public void setIngredientFactory(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
}
