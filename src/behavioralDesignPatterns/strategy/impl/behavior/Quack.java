package behavioralDesignPatterns.strategy.impl.behavior;

import behavioralDesignPatterns.strategy.api.behavior.QuackBehavior;

/**
 * behavioralDesignPatterns.strategy.impl.behavior.Quack
 * <p>
 * Date: 15.07.2017
 *
 * @author Mikalai Bezmen
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
