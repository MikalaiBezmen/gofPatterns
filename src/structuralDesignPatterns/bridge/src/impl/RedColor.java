package structuralDesignPatterns.bridge.src.impl;

import structuralDesignPatterns.bridge.src.api.Color;

/**
 * RedColor.
 * Date: 01/14/2018
 *
 * @author Mikalai Bezmen
 */
public class RedColor implements Color {

    @Override
    public void applyColor(){
        System.out.println("red.");
    }
}
