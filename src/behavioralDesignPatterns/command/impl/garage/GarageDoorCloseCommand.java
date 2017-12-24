package behavioralDesignPatterns.command.impl.garage;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * GarageDoorCloseCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class GarageDoorCloseCommand implements ICommand {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
