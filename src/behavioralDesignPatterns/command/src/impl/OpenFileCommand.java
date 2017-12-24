package behavioralDesignPatterns.command.src.impl;

import behavioralDesignPatterns.command.src.api.Command;
import behavioralDesignPatterns.command.src.api.FileSystemReceiver;

/**
 * OpenFileCommand.
 *
 * @author Mikalai Bezmen
 */
public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }
}
