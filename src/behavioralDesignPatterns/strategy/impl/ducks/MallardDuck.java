package behavioralDesignPatterns.strategy.impl.ducks;

import behavioralDesignPatterns.strategy.impl.behavior.FlyWithWings;
import behavioralDesignPatterns.strategy.impl.behavior.Quack;

/**
 * behavioralDesignPatterns.strategy.impl.ducks.MallardDuck
 * <p>
 * Date: 15.07.2017
 *
 * @author Mikalai Bezmen
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("display: " + getClass().getSimpleName());
    }
}
