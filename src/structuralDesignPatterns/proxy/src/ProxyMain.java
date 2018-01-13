package structuralDesignPatterns.proxy.src;

import structuralDesignPatterns.proxy.src.api.CommandExecutor;
import structuralDesignPatterns.proxy.src.impl.CommandExecutorProxy;

/**
 * ProxyMain.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class ProxyMain {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj","wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
