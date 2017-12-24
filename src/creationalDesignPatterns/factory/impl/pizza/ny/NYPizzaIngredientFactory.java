package creationalDesignPatterns.factory.impl.pizza.ny;

import creationalDesignPatterns.factory.api.IPizzaIngredientFactory;
import creationalDesignPatterns.factory.api.ingredient.Clams;
import creationalDesignPatterns.factory.api.ingredient.Cheese;
import creationalDesignPatterns.factory.api.ingredient.Dough;
import creationalDesignPatterns.factory.api.ingredient.Pepperoni;
import creationalDesignPatterns.factory.api.ingredient.Sauce;
import creationalDesignPatterns.factory.api.ingredient.Veggies;
import creationalDesignPatterns.factory.impl.ingredient.FreshClams;
import creationalDesignPatterns.factory.impl.ingredient.Garlic;
import creationalDesignPatterns.factory.impl.ingredient.MarinaraSauce;
import creationalDesignPatterns.factory.impl.ingredient.Mushroom;
import creationalDesignPatterns.factory.impl.ingredient.Onion;
import creationalDesignPatterns.factory.impl.ingredient.RedPepper;
import creationalDesignPatterns.factory.impl.ingredient.ReggianoCheese;
import creationalDesignPatterns.factory.impl.ingredient.SlicedPepperoni;
import creationalDesignPatterns.factory.impl.ingredient.ThinCrustDough;

/**
 * NYPizzaIngredientFactory.
 * Date: 07/20/2017
 *
 * @author Mikalai Bezmen
 */
public class NYPizzaIngredientFactory implements IPizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createCalm() {
        return new FreshClams();
    }
}
