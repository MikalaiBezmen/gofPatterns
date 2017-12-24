package behavioralDesignPatterns.command.api;

/**
 * ICommand.
 * Date: 07/24/2017
 *
 * @author Mikalai Bezmen
 */
public interface ICommand {

    void execute();

    void undo();
}
