package behavioralDesignPatterns.command.impl.ceilingFan;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * CeilingFanOnCommand.
 * Date: 08/26/2017
 *
 * @author Mikalai Bezmen
 */
public class CeilingFanOnCommand implements ICommand {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
