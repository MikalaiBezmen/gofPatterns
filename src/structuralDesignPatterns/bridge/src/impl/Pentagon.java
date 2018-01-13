package structuralDesignPatterns.bridge.src.impl;

import structuralDesignPatterns.bridge.src.api.Color;
import structuralDesignPatterns.bridge.src.api.Shape;

/**
 * Pentagon.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
