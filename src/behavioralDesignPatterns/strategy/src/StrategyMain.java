package behavioralDesignPatterns.strategy.src;

import behavioralDesignPatterns.strategy.src.api.Item;
import behavioralDesignPatterns.strategy.src.impl.CreditCardStrategy;
import behavioralDesignPatterns.strategy.src.impl.PaypalStrategy;
import behavioralDesignPatterns.strategy.src.impl.ShoppingCart;

/**
 * StrategyMain.
 *
 * @author Mikalai Bezmen
 */
public class StrategyMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Coca-Cola", 10);
        Item item2 = new Item("BitCoin", 40);
        cart.addItem(item1);
        cart.addItem(item2);
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
