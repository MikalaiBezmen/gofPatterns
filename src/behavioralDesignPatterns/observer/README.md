# Observer Pattern
Observer pattern is one of the behavioral design pattern. Observer design
pattern is useful when you are interested in the state of an object and want to
get notified whenever there is any change. In observer pattern, the object
that watch on the state of another object are called Observer and the object
that is being watched is called Subject. According to GoF, observer pattern
intent is:

`Define a one-to-many dependency between objects so
 that when one object changes state, all its dependents are
 notified and updated automatically.`
 
Observer pattern is also called as publish-subscribe pattern. Some of it’s
implementations are;
- java.util.EventListener in Swing
- javax.servlet.http.HttpSessionBindingListener
- javax.servlet.http.HttpSessionAttributeListener
