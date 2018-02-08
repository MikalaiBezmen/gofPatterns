package behavioralDesignPatterns.strategy.src.impl;

import behavioralDesignPatterns.strategy.src.api.Item;
import behavioralDesignPatterns.strategy.src.api.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Shopping cart.
 *
 * @author Mikalai Bezmen
 */
public class ShoppingCart {

    //List of items
    private List<Item> items;

    /**
     * Constructor.
     */
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds new item to the list of charts.
     *
     * @param item item to add
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * Removes item from chart list.
     *
     * @param item item for removing
     */
    public void removeItem(Item item) {
        this.items.remove(item);
    }

    /**
     * Pays for items with helpful of specific {@link PaymentStrategy}.
     *
     * @param paymentMethod instance of {@link PaymentStrategy}
     */
    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

    private int calculateTotal() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }
}
