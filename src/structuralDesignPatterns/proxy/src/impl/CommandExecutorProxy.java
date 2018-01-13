package structuralDesignPatterns.proxy.src.impl;

import structuralDesignPatterns.proxy.src.api.CommandExecutor;

/**
 * CommandExecutorProxy.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("Pankaj".equals(user) && "J@urnalD$v".equals(pwd)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for nonadmin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
