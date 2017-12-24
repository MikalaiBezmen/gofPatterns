package creationalDesignPatterns.factory.impl.pizza.ny;

import creationalDesignPatterns.factory.api.IPizzaIngredientFactory;
import creationalDesignPatterns.factory.api.Pizza;
import creationalDesignPatterns.factory.impl.PizzaStore;
import creationalDesignPatterns.factory.impl.PizzaTypeEnum;
import creationalDesignPatterns.factory.impl.pizza.CheesePizza;
import creationalDesignPatterns.factory.impl.pizza.ClamPizza;
import creationalDesignPatterns.factory.impl.pizza.PepperoniPizza;
import creationalDesignPatterns.factory.impl.pizza.VeggiePizza;

/**
 * NYPizzaStore.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaTypeEnum pizzaType) {
        Pizza pizza = null;
        IPizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (PizzaTypeEnum.CHEESE.equals(pizzaType)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("N/Y Style Cheese Pizza");
        } else if (PizzaTypeEnum.CLAM.equals(pizzaType)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("N/Y Style Clam Pizza");
        } else if (PizzaTypeEnum.VEGGIE.equals(pizzaType)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("N/Y Style Veggie Pizza");
        } else if (PizzaTypeEnum.PEPPERONI.equals(pizzaType)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("N/Y Style Pepperoni Pizza");
        }
        return pizza;
    }
}
