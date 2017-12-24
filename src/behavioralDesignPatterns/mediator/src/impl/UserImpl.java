package behavioralDesignPatterns.mediator.src.impl;

import behavioralDesignPatterns.mediator.src.api.ChatMediator;
import behavioralDesignPatterns.mediator.src.api.User;

/**
 * UserImpl.
 *
 * @author Mikalai Bezmen
 */
public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(getName() + ": Sending Message=" + msg);
        getMediator().sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(getName() + ": Received Message:" + msg);
    }
}
