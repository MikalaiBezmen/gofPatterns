package behavioralDesignPatterns.strategy.impl.ducks;

/**
 * ModelDuck.
 * Date: 07/15/2017
 *
 * @author Mikalai Bezmen
 */
public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("display: " + getClass().getSimpleName());
    }
}
