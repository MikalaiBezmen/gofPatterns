package creationalDesignPatterns.singletone.src;

import creationalDesignPatterns.singletone.src.impl.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

/**
 * SingletoneMain.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class SingletoneMain {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne =
                EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
