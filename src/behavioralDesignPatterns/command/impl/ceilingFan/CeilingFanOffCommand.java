package behavioralDesignPatterns.command.impl.ceilingFan;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * CeilingFanOffCommand.
 * Date: 08/26/2017
 *
 * @author Mikalai Bezmen
 */
public class CeilingFanOffCommand implements ICommand {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
