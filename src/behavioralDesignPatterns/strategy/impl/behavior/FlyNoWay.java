package behavioralDesignPatterns.strategy.impl.behavior;

import behavioralDesignPatterns.strategy.api.behavior.FlyBehavior;

/**
 * behavioralDesignPatterns.strategy.impl.behavior.FlyNoWay
 * <p>
 * Date: 15.07.2017
 *
 * @author Mikalai Bezmen
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
