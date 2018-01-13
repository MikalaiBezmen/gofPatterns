package creationalDesignPatterns.abstractFactory.src;

import creationalDesignPatterns.abstractFactory.src.api.Computer;
import creationalDesignPatterns.abstractFactory.src.impl.ComputerFactory;
import creationalDesignPatterns.abstractFactory.src.impl.PCFactory;
import creationalDesignPatterns.abstractFactory.src.impl.ServerFactory;

/**
 * AbstractFactoryMain.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
