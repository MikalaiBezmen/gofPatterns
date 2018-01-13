package creationalDesignPatterns.factory.src.impl;

import creationalDesignPatterns.factory.src.api.Computer;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Server)) return false;

        Server server = (Server) o;

        return ram.equals(server.ram) && hdd.equals(server.hdd) && cpu.equals(server.cpu);
    }

    @Override
    public int hashCode() {
        int result = ram.hashCode();
        result = 31 * result + hdd.hashCode();
        result = 31 * result + cpu.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Server{" + "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
