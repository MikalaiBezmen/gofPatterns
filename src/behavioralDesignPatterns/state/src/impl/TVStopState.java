package behavioralDesignPatterns.state.src.impl;

import behavioralDesignPatterns.state.src.api.State;

/**
 * TVStopState.
 *
 * @author Mikalai Bezmen
 */
public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
