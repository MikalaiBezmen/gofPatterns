package behavioralDesignPatterns.observer.api;

/**
 * ISubject.
 * Date: 07/16/2017
 *
 * @author Mikalai Bezmen
 */
public interface ISubject {

    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObserver();
}
