package behavioralDesignPatterns.strategy.src.impl;

import behavioralDesignPatterns.strategy.src.api.PaymentStrategy;

/**
 * Credit Card strategy.
 *
 * @author Mikalai Bezmen
 */
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    /**
     * Constructor.
     *
     * @param name         name
     * @param cardNumber   credit card number
     * @param cvv          cvv code
     * @param dateOfExpiry expiration date
     */
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card.");
    }
}
