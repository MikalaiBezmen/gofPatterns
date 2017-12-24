package behavioralDesignPatterns.chainOfResponsibility.src.api;

/**
 * DispenseChain.
 *
 * @author Mikalai Bezmen
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
