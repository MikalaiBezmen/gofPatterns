package behavioralDesignPatterns.interpreter.src;

import behavioralDesignPatterns.interpreter.src.impl.InterpreterClient;
import behavioralDesignPatterns.interpreter.src.impl.InterpreterContext;

/**
 * InterpreterMain.
 *
 * @author Mikalai Bezmen
 */
public class InterpreterMain {

    public static void main(String args[]) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";
        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));
    }
}
