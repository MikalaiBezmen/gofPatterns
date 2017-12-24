package behavioralDesignPatterns.command.src.impl;

import behavioralDesignPatterns.command.src.api.FileSystemReceiver;

/**
 * FileSystemReceiverUtil.
 *
 * @author Mikalai Bezmen
 */
public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
