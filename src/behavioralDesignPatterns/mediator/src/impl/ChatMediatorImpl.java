package behavioralDesignPatterns.mediator.src.impl;

import behavioralDesignPatterns.mediator.src.api.ChatMediator;
import behavioralDesignPatterns.mediator.src.api.User;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatMediatorImpl.
 *
 * @author Mikalai Bezmen
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
        //message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}
