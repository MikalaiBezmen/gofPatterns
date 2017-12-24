package behavioralDesignPatterns.command.impl.stereo;

/**
 * Stereo.
 * Date: 08/16/2017
 *
 * @author Mikalai Bezmen
 */
public class Stereo {

    private String roomName;

    public Stereo(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCD() {
        System.out.println("Stereo set CD");
    }

    public void setDVD() {
        System.out.println("Stereo set DVD");
    }

    public void setRadio() {
        System.out.println("Stereo set radio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set volume: " + volume);
    }
}
