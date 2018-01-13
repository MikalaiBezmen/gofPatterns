#Decorator Pattern
Decorator design pattern is used to modify the functionality of an object at
runtime. At the same time other instances of the same class will not be
affected by this, so individual object gets the modified behavior. Decorator
design pattern is one of the structural design pattern (such as Adapter
Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes or
interface with composition to implement.

Important Points
- Decorator pattern is helpful in providing runtime modification
abilities and hence more flexible. It’s easy to maintain and extend
when the number of choices are more.
- The disadvantage of decorator pattern is that it uses a lot of similar
kind of objects (decorators).
- Decorator pattern is used a lot in Java IO classes, such as FileReader,
BufferedReader etc.
