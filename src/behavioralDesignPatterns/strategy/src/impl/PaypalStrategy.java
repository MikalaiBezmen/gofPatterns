package behavioralDesignPatterns.strategy.src.impl;

import behavioralDesignPatterns.strategy.src.api.PaymentStrategy;

/**
 * PaypalStrategy.
 *
 * @author Mikalai Bezmen
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.emailId = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
