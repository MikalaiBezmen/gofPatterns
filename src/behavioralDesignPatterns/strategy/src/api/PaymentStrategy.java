package behavioralDesignPatterns.strategy.src.api;

/**
 * Payment strategy.
 *
 * @author Mikalai Bezmen
 */
public interface PaymentStrategy {

    /**
     * Pays for items.
     *
     * @param amount amount which should be paid
     */
    void pay(int amount);
}
