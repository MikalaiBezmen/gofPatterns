#Factory Pattern
Factory Pattern is one of the Creational Design pattern and it’s widely
used in JDK as well as frameworks like Spring and Struts.

Factory design pattern is used when we have a super class with multiple subclasses
and based on input, we need to return one of the sub-class. This
pattern take out the responsibility of instantiation of a class from client
program to the factory class. Let’s first learn how to implement factory
pattern in java and then we will learn its benefits and we will see its usage in
JDK.
##Benefits of Factory Pattern
- Factory pattern provides approach to code for interface rather than
implementation.
- Factory pattern removes the instantiation of actual implementation
classes from client code, making it more robust, less coupled and easy
to extend. For example, we can easily change PC class
implementation because client program is unaware of this.
- Factory pattern provides abstraction between implementation and
client classes through inheritance.
##Factory Pattern Examples in JDK
- java.util.Calendar, ResourceBundle and NumberFormat getInstance()
methods uses Factory pattern.
- valueOf() method in wrapper classes like Boolean, Integer etc.