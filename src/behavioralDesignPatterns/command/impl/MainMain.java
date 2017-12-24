package behavioralDesignPatterns.command.impl;

/**
 * MainMain.
 * Date: 08/29/2017
 *
 * @author Mikalai Bezmen
 */
public class MainMain {

    public static void main(String[] args) {
        System.out.println(sum(2, 3));
    }

    private static int sum(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return 9;
        }
    }

}
