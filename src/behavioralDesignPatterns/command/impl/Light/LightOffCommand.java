package behavioralDesignPatterns.command.impl.Light;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * LightOffCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class LightOffCommand implements ICommand {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
