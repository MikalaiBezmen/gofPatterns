package behavioralDesignPatterns.command.src.api;

/**
 * FileSystemReceiver.
 *
 * @author Mikalai Bezmen
 */
public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();
}
