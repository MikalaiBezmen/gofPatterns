package behavioralDesignPatterns.state.src;

import behavioralDesignPatterns.state.src.api.State;
import behavioralDesignPatterns.state.src.impl.TVContext;
import behavioralDesignPatterns.state.src.impl.TVStartState;
import behavioralDesignPatterns.state.src.impl.TVStopState;

/**
 * StateMain.
 *
 * @author Mikalai Bezmen
 */
public class StateMain {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();
        context.setState(tvStartState);
        context.doAction();
        context.setState(tvStopState);
        context.doAction();
    }
}
