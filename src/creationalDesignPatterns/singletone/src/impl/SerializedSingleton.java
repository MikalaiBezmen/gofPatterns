package creationalDesignPatterns.singletone.src.impl;

import java.io.Serializable;

/**
 * SerializedSingleton.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
