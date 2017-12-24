package creationalDesignPatterns.factory.impl.pizza.california;

import creationalDesignPatterns.factory.api.IPizzaIngredientFactory;
import creationalDesignPatterns.factory.api.ingredient.Cheese;
import creationalDesignPatterns.factory.api.ingredient.Clams;
import creationalDesignPatterns.factory.api.ingredient.Dough;
import creationalDesignPatterns.factory.api.ingredient.Pepperoni;
import creationalDesignPatterns.factory.api.ingredient.Sauce;
import creationalDesignPatterns.factory.api.ingredient.Veggies;
import creationalDesignPatterns.factory.impl.ingredient.BlackOlives;
import creationalDesignPatterns.factory.impl.ingredient.EggPlant;
import creationalDesignPatterns.factory.impl.ingredient.FrozenClams;
import creationalDesignPatterns.factory.impl.ingredient.Mozzarella;
import creationalDesignPatterns.factory.impl.ingredient.PlumTomatoSauce;
import creationalDesignPatterns.factory.impl.ingredient.SlicedPepperoni;
import creationalDesignPatterns.factory.impl.ingredient.Spinach;
import creationalDesignPatterns.factory.impl.ingredient.ThickCrustDough;

/**
 * CaliforniaPizzaIngredientFactory.
 * Date: 07/20/2017
 *
 * @author Mikalai Bezmen
 */
public class CaliforniaPizzaIngredientFactory implements IPizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createCalm() {
        return new FrozenClams();
    }
}
