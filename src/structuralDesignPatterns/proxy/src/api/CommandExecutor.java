package structuralDesignPatterns.proxy.src.api;

/**
 * CommandExecutor.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public interface CommandExecutor {

    void runCommand(String command) throws Exception;
}
