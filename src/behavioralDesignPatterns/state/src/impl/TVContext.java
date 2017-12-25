package behavioralDesignPatterns.state.src.impl;

import behavioralDesignPatterns.state.src.api.State;

/**
 * TVContext.
 *
 * @author Mikalai Bezmen
 */
public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return tvState;
    }

    @Override
    public void doAction() {
        tvState.doAction();
    }
}
