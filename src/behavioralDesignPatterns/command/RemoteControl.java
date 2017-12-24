package behavioralDesignPatterns.command;

import behavioralDesignPatterns.command.api.ICommand;

import java.util.Arrays;

/**
 * RemoteControl.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class RemoteControl {

    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private ICommand undoCommand;

    RemoteControl() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];

        ICommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RemoteControl{");
        sb.append("onCommands=").append(Arrays.toString(onCommands));
        sb.append(", offCommands=").append(Arrays.toString(offCommands));
        sb.append("}/n");
        return sb.toString();
    }
}
