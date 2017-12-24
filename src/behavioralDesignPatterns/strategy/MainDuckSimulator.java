package behavioralDesignPatterns.strategy;

import behavioralDesignPatterns.strategy.impl.behavior.FlyRockedPowered;
import behavioralDesignPatterns.strategy.impl.ducks.Duck;
import behavioralDesignPatterns.strategy.impl.ducks.ModelDuck;

/**
 * MainDuckSimulator.
 * Date: 07/16/2017
 *
 * @author Mikalai Bezmen
 */
public class MainDuckSimulator {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}
