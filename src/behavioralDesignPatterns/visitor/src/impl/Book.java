package behavioralDesignPatterns.visitor.src.impl;

import behavioralDesignPatterns.visitor.src.api.ItemElement;
import behavioralDesignPatterns.visitor.src.api.ShoppingCartVisitor;

/**
 * Book.
 *
 * @author Mikalai Bezmen
 */
public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
