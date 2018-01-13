package creationalDesignPatterns.abstractFactory.src.impl;


import creationalDesignPatterns.abstractFactory.src.api.Computer;

/**
 * Server.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
