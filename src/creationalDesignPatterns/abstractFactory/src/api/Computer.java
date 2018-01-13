package creationalDesignPatterns.abstractFactory.src.api;

/**
 * Computer.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU = " + this.getCPU();
    }
}
