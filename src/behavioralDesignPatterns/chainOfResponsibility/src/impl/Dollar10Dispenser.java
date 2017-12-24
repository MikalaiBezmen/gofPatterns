package behavioralDesignPatterns.chainOfResponsibility.src.impl;

import behavioralDesignPatterns.chainOfResponsibility.src.api.Currency;
import behavioralDesignPatterns.chainOfResponsibility.src.api.DispenseChain;

/**
 * Dollar10Dispenser.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(currency);
        }
    }
}
