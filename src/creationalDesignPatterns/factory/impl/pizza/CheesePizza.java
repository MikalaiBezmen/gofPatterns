package creationalDesignPatterns.factory.impl.pizza;

import creationalDesignPatterns.factory.api.IPizzaIngredientFactory;
import creationalDesignPatterns.factory.api.Pizza;

/**
 * CheesePizza.
 * Date: 07/20/2017
 *
 * @author Mikalai Bezmen
 */
public class CheesePizza extends Pizza {

    private IPizzaIngredientFactory ingredientFactory;

    public CheesePizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
    }

    public IPizzaIngredientFactory getIngredientFactory() {
        return ingredientFactory;
    }

    public void setIngredientFactory(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
}
