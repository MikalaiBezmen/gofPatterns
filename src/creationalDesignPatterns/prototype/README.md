#Prototype Pattern
Prototype pattern is one of the Creational Design pattern, so it provides a
mechanism of object creation. Prototype pattern is used when the Object
creation is a costly affair and requires a lot of time and resources and you
have a similar object already existing. So this pattern provides a mechanism
to copy the original object to a new object and then modify it according to
our needs. This pattern uses java cloning to copy the object.

It would be easy to understand this pattern with an example, suppose we
have an Object that loads data from database. Now we need to modify this
data in our program multiple times, so it’s not a good idea to create the
Object using _new_ keyword and load all the data again from database. So the
better approach is to clone the existing object into a new object and then do
the data manipulation.

Prototype design pattern mandates that the Object which you are copying
should provide the copying feature. It should not be done by any other class.
However whether to use shallow or deep copy of the Object properties
depends on the requirements and it’s a design decision.
