package structuralDesignPatterns.adapter.domain;

/**
 * Socket класс который умеет передавать только 120 вольт.
 *
 * @author Mikalai Bezmen
 */
public class Socket {

    private static final int VOLTS = 120;

    public Volt getVolt() {
        return new Volt(VOLTS);
    }
}
