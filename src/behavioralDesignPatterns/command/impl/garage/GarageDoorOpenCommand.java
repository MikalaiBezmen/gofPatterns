package behavioralDesignPatterns.command.impl.garage;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * GarageDoorOpenCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class GarageDoorOpenCommand implements ICommand {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
