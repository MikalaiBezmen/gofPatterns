package behavioralDesignPatterns.mediator.src.api;

/**
 * ChatMediator.
 *
 * @author Mikalai Bezmen
 */
public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
