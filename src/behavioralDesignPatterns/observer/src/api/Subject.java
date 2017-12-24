package behavioralDesignPatterns.observer.src.api;

/**
 * Subject.
 *
 * @author Mikalai Bezmen
 */
public interface Subject {

    //methods to register and unregister observers
    void register(Observer observer);

    void unregister(Observer observer);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from subject
    Object getUpdate(Observer observer);
}
