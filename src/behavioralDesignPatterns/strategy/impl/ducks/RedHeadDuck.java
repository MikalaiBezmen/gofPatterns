package behavioralDesignPatterns.strategy.impl.ducks;

/**
 * behavioralDesignPatterns.strategy.impl.ducks.RedHeadDuck
 * <p>
 * Date: 15.07.2017
 *
 * @author Mikalai Bezmen
 */
public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("display: " + getClass().getSimpleName());
    }
}
