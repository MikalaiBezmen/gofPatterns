package behavioralDesignPatterns.interpreter.src.impl;

import behavioralDesignPatterns.interpreter.src.api.Expression;

/**
 * InterpreterClient.
 * Date: 12/25/2017
 *
 * @author Mikalai Bezmen
 */
public class InterpreterClient {

    private InterpreterContext ic;

    public InterpreterClient(InterpreterContext i) {
        this.ic = i;
    }

    public String interpret(String str) {
        Expression exp;
        //create rules for expressions
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            return str;
        }
        return exp.interpret(ic);
    }
}
