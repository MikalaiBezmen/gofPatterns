package structuralDesignPatterns.proxy.src.impl;

import structuralDesignPatterns.proxy.src.api.CommandExecutor;

import java.io.IOException;

/**
 * CommandExecutorImpl.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
