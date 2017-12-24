package behavioralDesignPatterns.command.src.impl;

import behavioralDesignPatterns.command.src.api.FileSystemReceiver;

/**
 * UnixFileSystemReceiver.
 *
 * @author Mikalai Bezmen
 */
public class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in unix OS");
    }
}
