package behavioralDesignPatterns.mediator.src.api;

/**
 * User.
 *
 * @author Mikalai Bezmen
 */
public abstract class User {

    private ChatMediator mediator;
    private String name;

    public User(ChatMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    protected ChatMediator getMediator() {
        return mediator;
    }

    protected void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
