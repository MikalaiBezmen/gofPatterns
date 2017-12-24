package behavioralDesignPatterns.command.src.impl;

import behavioralDesignPatterns.command.src.api.Command;
import behavioralDesignPatterns.command.src.api.FileSystemReceiver;

/**
 * WriteFileCommand.
 *
 * @author Mikalai Bezmen
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}
