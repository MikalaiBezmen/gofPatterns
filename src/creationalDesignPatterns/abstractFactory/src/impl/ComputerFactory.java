package creationalDesignPatterns.abstractFactory.src.impl;

import creationalDesignPatterns.abstractFactory.src.api.Computer;
import creationalDesignPatterns.abstractFactory.src.api.ComputerAbstractFactory;

/**
 * Consumer class that will provide the entry point for the
 * client classes to create sub-classes.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
