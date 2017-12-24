package creationalDesignPatterns.factory.api;

import creationalDesignPatterns.factory.api.ingredient.Clams;
import creationalDesignPatterns.factory.api.ingredient.Cheese;
import creationalDesignPatterns.factory.api.ingredient.Dough;
import creationalDesignPatterns.factory.api.ingredient.Pepperoni;
import creationalDesignPatterns.factory.api.ingredient.Sauce;
import creationalDesignPatterns.factory.api.ingredient.Veggies;

/**
 * IPizzaIngredientFactory.
 * Date: 07/20/2017
 *
 * @author Mikalai Bezmen
 */
public interface IPizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createCalm();

}
