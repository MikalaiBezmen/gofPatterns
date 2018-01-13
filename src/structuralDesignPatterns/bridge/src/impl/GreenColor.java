package structuralDesignPatterns.bridge.src.impl;

import structuralDesignPatterns.bridge.src.api.Color;

/**
 * GreenColor.
 * Date: 01/14/2018
 *
 * @author Mikalai Bezmen
 */
public class GreenColor implements Color {

    public void applyColor() {
        System.out.println("green.");
    }
}
