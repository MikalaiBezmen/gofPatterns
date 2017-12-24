package behavioralDesignPatterns.command.impl.garage;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * GarageLightOnCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class GarageLightOnCommand implements ICommand {

    private GarageDoor garageDoor;

    public GarageLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
    }
}
