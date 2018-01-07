#Singleton Pattern
Singleton is one of the Gangs of Four Design patterns and comes in
the Creational Design Pattern category. From the definition, it seems to be
a very simple design pattern but when it comes to implementation, it comes
with a lot of implementation concerns. The implementation of Singleton
pattern has always been a controversial topic among developers. Here we
will learn about Singleton design pattern principles, different ways to
implement Singleton and some of the best practices for its usage.

Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine. The singleton
class must provide a global access point to get the instance of the class.
Singleton pattern is used for logging, driver objects, caching and thread
pool.

Singleton design pattern is also used in other design patterns like Abstract
Factory, Builder, Prototype, Facade etc. Singleton design pattern is used in
core java classes also, for example java.lang.Runtime, java.awt.Desktop.

To implement Singleton pattern, we have different approaches but all of
them have following common concepts.
- Private constructor to restrict instantiation of the class from other
classes.
- Private static variable of the same class that is the only instance of the
class.
- Public static method that returns the instance of the class, this is the
global access point for outer world to get the instance of the singleton
class.
