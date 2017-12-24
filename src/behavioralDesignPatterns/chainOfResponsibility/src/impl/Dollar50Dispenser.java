package behavioralDesignPatterns.chainOfResponsibility.src.impl;

import behavioralDesignPatterns.chainOfResponsibility.src.api.Currency;
import behavioralDesignPatterns.chainOfResponsibility.src.api.DispenseChain;

/**
 * Dollar50Dispenser.
 *
 * @author Mikalai Bezmen
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(currency);
        }
    }
}
