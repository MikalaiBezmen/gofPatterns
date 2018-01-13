package creationalDesignPatterns.factory.src;

import creationalDesignPatterns.factory.src.api.Computer;
import creationalDesignPatterns.factory.src.impl.ComputerFactory;

/**
 * FactoryMain.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class FactoryMain {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB", " 2.4 GHz ");
        Computer server = ComputerFactory.getComputer("server", "16GB", "1TB", " 2.9 GHz ");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
