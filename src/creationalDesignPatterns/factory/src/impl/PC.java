package creationalDesignPatterns.factory.src.impl;

import creationalDesignPatterns.factory.src.api.Computer;

/**
 * PC.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    PC(String ram, String hdd, String cpu) {
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
        if (!(o instanceof PC)) return false;

        PC pc = (PC) o;

        return ram.equals(pc.ram) && hdd.equals(pc.hdd) && cpu.equals(pc.cpu);
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
        return "PC{" + "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
