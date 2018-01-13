package creationalDesignPatterns.builder.src;

import creationalDesignPatterns.builder.src.impl.Computer;

/**
 * BuilderMain.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class BuilderMain {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comouter = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
