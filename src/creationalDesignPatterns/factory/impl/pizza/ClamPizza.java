package creationalDesignPatterns.factory.impl.pizza;

import creationalDesignPatterns.factory.api.IPizzaIngredientFactory;
import creationalDesignPatterns.factory.api.Pizza;

/**
 * ClamPizza.
 * Date: 07/20/2017
 *
 * @author Mikalai Bezmen
 */
public class ClamPizza extends Pizza {

    private IPizzaIngredientFactory ingredientFactory;

    public ClamPizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setClam(ingredientFactory.createCalm());
    }

    public IPizzaIngredientFactory getIngredientFactory() {
        return ingredientFactory;
    }

    public void setIngredientFactory(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
}
