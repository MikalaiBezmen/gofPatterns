package behavioralDesignPatterns.state.src.impl;

import behavioralDesignPatterns.state.src.api.State;

/**
 * TVStartState.
 *
 * @author Mikalai Bezmen
 */
public class TVStartState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
