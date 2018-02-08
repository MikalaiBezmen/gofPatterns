package behavioralDesignPatterns.strategy.src.impl;

import behavioralDesignPatterns.strategy.src.api.PaymentStrategy;

/**
 * PayPal Strategy.
 *
 * @author Mikalai Bezmen
 */
public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    /**
     * Constructor.
     *
     * @param email    email
     * @param password password
     */
    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
