package structuralDesignPatterns.bridge.src;

import structuralDesignPatterns.bridge.src.api.Shape;
import structuralDesignPatterns.bridge.src.impl.GreenColor;
import structuralDesignPatterns.bridge.src.impl.Pentagon;
import structuralDesignPatterns.bridge.src.impl.RedColor;
import structuralDesignPatterns.bridge.src.impl.Triangle;

/**
 * BridgeMain.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class BridgeMain {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();
        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
