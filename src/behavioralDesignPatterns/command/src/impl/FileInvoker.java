package behavioralDesignPatterns.command.src.impl;

import behavioralDesignPatterns.command.src.api.Command;

/**
 * FileInvoker.
 *
 * @author Mikalai Bezmen
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
