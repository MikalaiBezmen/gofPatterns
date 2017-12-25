package behavioralDesignPatterns.interpreter.src.api;

import behavioralDesignPatterns.interpreter.src.impl.InterpreterContext;

/**
 * Expression.
 * Date: 12/25/2017
 *
 * @author Mikalai Bezmen
 */
public interface Expression {

    String interpret(InterpreterContext ic);
}
