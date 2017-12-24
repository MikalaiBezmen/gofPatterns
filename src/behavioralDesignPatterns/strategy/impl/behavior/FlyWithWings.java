package behavioralDesignPatterns.strategy.impl.behavior;

import behavioralDesignPatterns.strategy.api.behavior.FlyBehavior;

/**
 * behavioralDesignPatterns.strategy.impl.behavior.FlyWithWings
 * <p>
 * Date: 15.07.2017
 *
 * @author Mikalai Bezmen
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
