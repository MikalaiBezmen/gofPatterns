package behavioralDesignPatterns.command.impl.garage;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * GarageDoorStopCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class GarageDoorStopCommand implements ICommand {

    private GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.stop();
    }
}
