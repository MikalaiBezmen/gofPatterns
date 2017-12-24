package behavioralDesignPatterns.observer.api;

import behavioralDesignPatterns.observer.impl.Weather;

/**
 * IObserver.
 * Date: 07/16/2017
 *
 * @author Mikalai Bezmen
 */
public interface IObserver {

    void update(Weather weather);
}
