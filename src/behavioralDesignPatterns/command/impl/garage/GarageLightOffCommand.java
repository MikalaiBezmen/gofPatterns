package behavioralDesignPatterns.command.impl.garage;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * GarageLightOffCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class GarageLightOffCommand implements ICommand {

    private GarageDoor garageDoor;

    public GarageLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
    }
}
