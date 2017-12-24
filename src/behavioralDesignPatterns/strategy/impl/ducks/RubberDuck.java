package behavioralDesignPatterns.strategy.impl.ducks;

/**
 * behavioralDesignPatterns.strategy.impl.ducks.RubberDuck
 * <p>
 * Date: 15.07.2017
 *
 * @author Mikalai Bezmen
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("display: " + getClass().getSimpleName());
    }
}
