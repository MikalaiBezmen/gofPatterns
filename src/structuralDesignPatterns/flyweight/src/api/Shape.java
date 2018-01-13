package structuralDesignPatterns.flyweight.src.api;

import java.awt.*;

/**
 * Shape.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public interface Shape {

    void draw(Graphics g, int x, int y, int width, int height, Color color);
}
