package structuralDesignPatterns.bridge.src.api;

/**
 * Shape.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public abstract class Shape {

    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
