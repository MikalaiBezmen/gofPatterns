#Facade Pattern
Facade Pattern is one of the Structural design patterns (such as Adapter
pattern and Decorator pattern) and used to help client applications to easily
interact with the system.
According to GoF Facade design pattern is:

`Provide a unified interface to a set of interfaces in a
 subsystem. Facade Pattern defines a higher-level
 interface that makes the subsystem easier to use`
 
 Provide a unified interface to a set of interfaces in a subsystem. Facade
 Pattern defines a higher-level interface that makes the subsystem easier to
 use.
 
 Important Points
 - Facade pattern is more like a helper for client applications, it doesn’t
 hide subsystem interfaces from the client. Whether to use Facade or
 not is completely dependent on client code.
 - Facade pattern can be applied at any point of development, usually
 when the number of interfaces grow and system gets complex.
 - Subsystem interfaces are not aware of Facade and they shouldn’t have
 any reference of the Facade interface.
 - Facade pattern should be applied for similar kind of interfaces, its
 purpose is to provide a single interface rather than multiple interfaces
 that does the similar kind of jobs.
 - We can use Factory pattern with Facade to provide better interface to
 client systems.
 