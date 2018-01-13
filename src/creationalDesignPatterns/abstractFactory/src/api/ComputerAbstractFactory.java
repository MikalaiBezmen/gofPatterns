package creationalDesignPatterns.abstractFactory.src.api;

/**
 * ComputerAbstractFactory.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public interface ComputerAbstractFactory {

    /*
    Notice that createComputer() method is returning an instance of super class
    Computer. Now our factory classes will implement this interface and return
    their respective sub-class.
     */
    Computer createComputer();
}
