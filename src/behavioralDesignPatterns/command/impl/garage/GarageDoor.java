package behavioralDesignPatterns.command.impl.garage;

/**
 * GarageDoor.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class GarageDoor {

    public void up() {
        System.out.println("Garage door open");
    }

    public void down() {
        System.out.println("Garage door closed");
    }

    public void stop() {
        System.out.println("Garage door stoped");
    }

    public void lightOn() {
        System.out.println("Light in garage on");
    }

    public void lightOff() {
        System.out.println("Light in garage off");
    }
}
