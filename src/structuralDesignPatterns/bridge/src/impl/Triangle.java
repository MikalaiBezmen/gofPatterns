package structuralDesignPatterns.bridge.src.impl;

import structuralDesignPatterns.bridge.src.api.Color;
import structuralDesignPatterns.bridge.src.api.Shape;

/**
 * Triangle.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }
    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
