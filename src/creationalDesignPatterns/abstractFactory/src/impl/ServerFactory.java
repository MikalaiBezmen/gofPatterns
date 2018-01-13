package creationalDesignPatterns.abstractFactory.src.impl;

import creationalDesignPatterns.abstractFactory.src.api.Computer;
import creationalDesignPatterns.abstractFactory.src.api.ComputerAbstractFactory;

/**
 * ServerFactory.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
