package creationalDesignPatterns.singletone.src.impl;

/**
 * LazyInitializedSingleton.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
