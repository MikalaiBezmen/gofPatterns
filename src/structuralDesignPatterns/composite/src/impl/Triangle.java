package structuralDesignPatterns.composite.src.impl;

import structuralDesignPatterns.composite.src.api.Shape;

/**
 * Triangle.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);
    }
}
