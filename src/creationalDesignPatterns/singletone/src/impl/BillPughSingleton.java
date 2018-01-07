package creationalDesignPatterns.singletone.src.impl;

/**
 * BillPughSingleton.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
