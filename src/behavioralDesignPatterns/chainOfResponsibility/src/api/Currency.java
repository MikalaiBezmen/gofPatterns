package behavioralDesignPatterns.chainOfResponsibility.src.api;

/**
 * Currency.
 *
 * @author Mikalai Bezmen
 */
public class Currency {

    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
