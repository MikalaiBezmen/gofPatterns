package behavioralDesignPatterns.strategy.impl.ducks;

/**
 * behavioralDesignPatterns.strategy.impl.ducks.DecoyDuck
 * <p>
 * Date: 15.07.2017
 *
 * @author Mikalai Bezmen
 */
public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("display: " + getClass().getSimpleName());
    }
}
