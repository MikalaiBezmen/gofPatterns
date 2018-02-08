package behavioralDesignPatterns.state.src.impl;

import behavioralDesignPatterns.state.src.api.State;

/**
 * TV Context.
 *
 * @author Mikalai Bezmen
 */
public class TVContext implements State {

    private State tvState;

    @Override
    public void doAction() {
        tvState.doAction();
    }

    /**
     * Sets state.
     *
     * @param state instance of {@link State}
     */
    public void setState(State state) {
        this.tvState = state;
    }
}
