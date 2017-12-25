package behavioralDesignPatterns.interpreter.src.impl;

import behavioralDesignPatterns.interpreter.src.api.Expression;

/**
 * IntToBinaryExpression.
 * Date: 12/25/2017
 *
 * @author Mikalai Bezmen
 */
public class IntToBinaryExpression implements Expression {

    private int i;

    IntToBinaryExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
