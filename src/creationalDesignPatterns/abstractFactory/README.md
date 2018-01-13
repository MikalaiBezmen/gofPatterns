#Abstract Factory Pattern
Abstract Factory is one of the Creational pattern and almost similar to
Factory Pattern except the fact that it’s more like factory of factories.
If you are familiar with factory design pattern in java, you will notice that
we have a single Factory class that returns the different sub-classes based on
the input provided and factory class uses if-else or switch statement to
achieve this.

In Abstract Factory pattern, we get rid of if-else block and have a factory
class for each sub-class and then an Abstract Factory class that will return
the sub-class based on the input factory class. At first it seems confusing but
once you see the implementation, it’s really easy to grasp and understand the
minor difference between Factory and Abstract Factory pattern.
##Benefits of Abstract Factory Pattern
- Abstract Factory pattern provides approach to code for interface rather
than implementation.
- Abstract Factory pattern is “factory of factories” and can be easily
extended to accommodate more products, for example we can add
another sub-class Laptop and a factory LaptopFactory.
- Abstract Factory pattern is robust and avoid conditional logic of
Factory pattern.
##Abstract Factory Pattern Examples in JDK
- javax.xml.parsers.DocumentBuilderFactory#newInstance()
- javax.xml.transform.TransformerFactory#newInstance()
- javax.xml.xpath.XPathFactory#newInstance()
