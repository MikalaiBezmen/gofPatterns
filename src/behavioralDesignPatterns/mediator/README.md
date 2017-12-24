Mediator Pattern

Mediator Pattern is one of the behavioral design pattern, so it deals with
the behaviors of objects. Mediator design pattern is used to provide a
centralized communication medium between different objects in a system.
According to GoF, mediator pattern intent is:

`Allows loose coupling by encapsulating the way
 disparate sets of objects interact and communicate with
 each other. Allows for the actions of each object set to
 vary independently of one another`
 
## Mediator Pattern in JDK
- java.util.Timer class scheduleXXX() methods
- Java Concurrency Executor execute() method.
- java.lang.reflect.Method invoke() method.

## Important Points
- Mediator pattern is useful when the communication logic between
objects is complex, we can have a central point of communication that
takes care of communication logic.
- Java Message Service (JMS) uses Mediator pattern along with
Observer pattern to allow applications to subscribe and publish data
to other applications.
- We should not use mediator pattern just to achieve lose-coupling
because if the number of mediators will grow, then it will become
hard to maintain them.