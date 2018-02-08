package behavioralDesignPatterns.strategy.src;

import behavioralDesignPatterns.strategy.src.api.Item;
import behavioralDesignPatterns.strategy.src.impl.CreditCardStrategy;
import behavioralDesignPatterns.strategy.src.impl.PayPalStrategy;
import behavioralDesignPatterns.strategy.src.impl.ShoppingCart;

/**
 * Test class for Strategy pattern.
 *
 * @author Mikalai Bezmen
 */
public class StrategyMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        //add new item to chart list
        cart.addItem(new Item("Coca-Cola", 10));
        cart.addItem(new Item("BitCoin", 40));
        //pay by PayPal
        cart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));
        //pay by credit card
        cart.pay(new CreditCardStrategy("Mikalai Bezmen", "1234567890123456", "786", "12/15"));
    }
}
