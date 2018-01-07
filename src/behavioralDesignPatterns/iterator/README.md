#Iterator Pattern
Iterator pattern in one of the behavioral pattern and it’s used to provide a
standard way to traverse through a group of Objects. Iterator pattern is
widely used in Java Collection Framework where Iterator interface provides
methods for traversing through a collection. According to GoF, iterator
design pattern intent is:

`Provides a way to access the elements of an
aggregate object without exposing its underlying
representation`

Iterator pattern is not only about traversing through a collection, we can
provide different kind of iterators based on our requirements. Iterator pattern
hides the actual implementation of traversal through the collection and client
programs just use iterator methods.

##Iterator Pattern in JDK
We all know that Collection framework Iterator is the best example of
iterator pattern implementation but do you know that java.util.Scanner class
also Implements Iterator interface. Read this post to learn about Java
Scanner Class(https://www.journaldev.com/872/java-scanner-class-java-util-scanner).

##Important Points
- Iterator pattern is useful when you want to provide a standard way to
iterate over a collection and hide the implementation logic from client
program.
- The logic for iteration is embedded in the collection itself and it helps
client program to iterate over them easily.