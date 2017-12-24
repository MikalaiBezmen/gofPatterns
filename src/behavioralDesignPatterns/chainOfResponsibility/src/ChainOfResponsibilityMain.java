package behavioralDesignPatterns.chainOfResponsibility.src;

import behavioralDesignPatterns.chainOfResponsibility.src.api.Currency;
import behavioralDesignPatterns.chainOfResponsibility.src.impl.ATMDispenseChain;

import java.util.Scanner;

/**
 * ChainOfResponsibilityMain.
 *
 * @author Mikalai Bezmen
 */
public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.getFirstChain().dispense(new Currency(amount));
        }
    }
}
