package behavioralDesignPatterns.strategy.src.impl;

import behavioralDesignPatterns.strategy.src.api.Item;
import behavioralDesignPatterns.strategy.src.api.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart.
 *
 * @author Mikalai Bezmen
 */
public class ShoppingCart {

    //List of items
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

    private int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}
