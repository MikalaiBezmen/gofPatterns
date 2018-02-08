package behavioralDesignPatterns.state.src;

import behavioralDesignPatterns.state.src.api.State;
import behavioralDesignPatterns.state.src.impl.TVContext;
import behavioralDesignPatterns.state.src.impl.TVStartState;
import behavioralDesignPatterns.state.src.impl.TVStopState;

/**
 * Test class for state pattern.
 *
 * @author Mikalai Bezmen
 */
public class StateMain {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        // Initializes different states
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }
}
