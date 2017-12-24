package behavioralDesignPatterns.observer.src.api;

/**
 * Observer.
 *
 * @author Mikalai Bezmen
 */
public interface Observer {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject subject);
}
