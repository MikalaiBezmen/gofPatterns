package behavioralDesignPatterns.command.impl.stereo;

import behavioralDesignPatterns.command.api.ICommand;

/**
 * StereoOnWithCDCommand.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class StereoOnWithCDCommand implements ICommand {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
