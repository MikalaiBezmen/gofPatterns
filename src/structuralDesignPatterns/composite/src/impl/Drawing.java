package structuralDesignPatterns.composite.src.impl;

import structuralDesignPatterns.composite.src.api.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Drawing.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class Drawing implements Shape {

    //collection of Shapes
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape sh : shapes) {
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape s) {
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s) {
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
