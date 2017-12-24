package creationalDesignPatterns.factory;

import creationalDesignPatterns.factory.api.Pizza;
import creationalDesignPatterns.factory.impl.PizzaStore;
import creationalDesignPatterns.factory.impl.PizzaTypeEnum;
import creationalDesignPatterns.factory.impl.pizza.chicago.ChicagoPizzaStore;
import creationalDesignPatterns.factory.impl.pizza.ny.NYPizzaStore;

/**
 * FactoryMain.
 * Date: 07/18/2017
 *
 * @author Mikalai Bezmen
 */
public class FactoryMain {

    @Deprecated
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaTypeEnum.CHEESE);
        System.out.println("Eathan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaTypeEnum.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
