package behavioralDesignPatterns.command.impl.ceilingFan;

/**
 * CeilingFan.
 * Date: 08/26/2017
 *
 * @author Mikalai Bezmen
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;
    private String roomName;

    public CeilingFan(String roomName) {
        this.roomName = roomName;
        speed = OFF;
    }

    public void on() {
        speed = HIGH;
        System.out.println("Ceiling Fan is on in " + roomName);
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling Fan is off in " + roomName);
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public int getSpeed() {
        return speed;
    }
}
