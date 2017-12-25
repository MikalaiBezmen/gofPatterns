package behavioralDesignPatterns.interpreter.src.impl;

import behavioralDesignPatterns.interpreter.src.api.Expression;

/**
 * IntToHexExpression.
 * Date: 12/25/2017
 *
 * @author Mikalai Bezmen
 */
public class IntToHexExpression implements Expression {

    private int i;

    IntToHexExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
