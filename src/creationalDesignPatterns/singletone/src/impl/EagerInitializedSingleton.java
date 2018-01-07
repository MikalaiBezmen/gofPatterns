package creationalDesignPatterns.singletone.src.impl;

/**
 * EagerInitializedSingleton.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    //private constructor to avoid client applications to use constructor

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
