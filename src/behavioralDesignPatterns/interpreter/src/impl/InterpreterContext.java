package behavioralDesignPatterns.interpreter.src.impl;

/**
 * InterpreterContext.
 *
 * @author Mikalai Bezmen
 */
public class InterpreterContext {

    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }

}
