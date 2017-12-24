package behavioralDesignPatterns.strategy.impl.ducks;

import behavioralDesignPatterns.strategy.api.behavior.FlyBehavior;
import behavioralDesignPatterns.strategy.api.behavior.QuackBehavior;
import behavioralDesignPatterns.strategy.impl.behavior.FlyWithWings;
import behavioralDesignPatterns.strategy.impl.behavior.Quack;

/**
 * behavioralDesignPatterns.strategy.impl.ducks.Duck.
 * Date: 07/15/2017
 *
 * @author Mikalai Bezmen
 */
public abstract class Duck {

    private FlyBehavior flyBehavior = new FlyWithWings();
    private QuackBehavior quackBehavior = new Quack();

    public Duck() {
        // Default constructor
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println(getClass().getName() + " can swim");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();
}
