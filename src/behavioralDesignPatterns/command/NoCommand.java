package behavioralDesignPatterns.command;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * NoCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class NoCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("Do nothing");
    }

    @Override
    public void undo() {
        System.out.println("Do nothing");
    }
}
