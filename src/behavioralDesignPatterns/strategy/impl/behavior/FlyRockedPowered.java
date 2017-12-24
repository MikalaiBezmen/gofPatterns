package behavioralDesignPatterns.strategy.impl.behavior;

import behavioralDesignPatterns.strategy.api.behavior.FlyBehavior;

/**
 * FlyRockedPowered.
 * Date: 07/15/2017
 *
 * @author Mikalai Bezmen
 */
public class FlyRockedPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
