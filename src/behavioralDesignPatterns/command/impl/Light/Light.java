package behavioralDesignPatterns.command.impl.Light;

/**
 * Light.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class Light {

    private String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(roomName + "light on");
    }

    public void off() {
        System.out.println(roomName + "light off");
    }
}
