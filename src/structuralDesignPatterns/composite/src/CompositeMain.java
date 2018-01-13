package structuralDesignPatterns.composite.src;

import structuralDesignPatterns.composite.src.api.Shape;
import structuralDesignPatterns.composite.src.impl.Circle;
import structuralDesignPatterns.composite.src.impl.Drawing;
import structuralDesignPatterns.composite.src.impl.Triangle;

/**
 * CompositeMain.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class CompositeMain {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);
        drawing.draw("Red");
        drawing.clear();
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
