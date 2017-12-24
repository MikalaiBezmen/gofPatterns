package behavioralDesignPatterns.command.src.impl;

import behavioralDesignPatterns.command.src.api.Command;
import behavioralDesignPatterns.command.src.api.FileSystemReceiver;

/**
 * CloseFileCommand.
 *
 * @author Mikalai Bezmen
 */
public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
