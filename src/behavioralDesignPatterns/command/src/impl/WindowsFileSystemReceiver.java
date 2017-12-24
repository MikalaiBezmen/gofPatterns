package behavioralDesignPatterns.command.src.impl;

import behavioralDesignPatterns.command.src.api.FileSystemReceiver;

/**
 * WindowsFileSystemReceiver.
 *
 * @author Mikalai Bezmen
 */
public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS");
    }
}
