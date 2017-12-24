package behavioralDesignPatterns.chainOfResponsibility.src.impl;

import behavioralDesignPatterns.chainOfResponsibility.src.api.DispenseChain;

/**
 * ATMDispenseChain.
 * Date: 12/24/2017
 *
 * @author Mikalai Bezmen
 */
public class ATMDispenseChain {

    private DispenseChain firstChain;

    public ATMDispenseChain() {
        // initialize the chain
        firstChain = new Dollar50Dispenser();
        DispenseChain secondChain = new Dollar20Dispenser();
        DispenseChain thirdChain = new Dollar10Dispenser();
        // set the chain of responsibility
        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);
    }

    public DispenseChain getFirstChain() {
        return firstChain;
    }
}
