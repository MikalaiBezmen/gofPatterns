package behavioralDesignPatterns.command.src;

import behavioralDesignPatterns.command.src.api.FileSystemReceiver;
import behavioralDesignPatterns.command.src.impl.CloseFileCommand;
import behavioralDesignPatterns.command.src.impl.FileInvoker;
import behavioralDesignPatterns.command.src.impl.FileSystemReceiverUtil;
import behavioralDesignPatterns.command.src.impl.OpenFileCommand;
import behavioralDesignPatterns.command.src.impl.WriteFileCommand;

/**
 * CommandMain.
 *
 * @author Mikalai Bezmen
 */
public class CommandMain {

    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);
        //perform action on invoker object
        file.execute();
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
