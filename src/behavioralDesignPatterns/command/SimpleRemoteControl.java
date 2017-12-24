package behavioralDesignPatterns.command;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * SimpleRemoteControl.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class SimpleRemoteControl {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void buttonWasPassed() {
        command.execute();
    }
}
