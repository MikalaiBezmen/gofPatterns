package behavioralDesignPatterns.command.impl.Light;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * LightOnCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class LightOnCommand implements ICommand {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
