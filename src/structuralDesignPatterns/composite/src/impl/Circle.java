package structuralDesignPatterns.composite.src.impl;

import structuralDesignPatterns.composite.src.api.Shape;

/**
 * Circle.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}
