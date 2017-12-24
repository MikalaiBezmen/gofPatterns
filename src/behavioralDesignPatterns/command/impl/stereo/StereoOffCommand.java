package behavioralDesignPatterns.command.impl.stereo;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * StereoOffCommand.
 * Date: 08/26/2017
 *
 * @author Mikalai Bezmen
 */
public class StereoOffCommand implements ICommand {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
