#Proxy Pattern
Proxy Design pattern is one of the Structural design pattern and in my
opinion one of the simplest pattern to understand. Proxy pattern intent
according to GoF is:

`Provide a surrogate or placeholder for another
 object to control access to it`
 
 The definition itself is very clear and proxy pattern is used when we want to
 provide controlled access of a functionality. Let’s say we have a class that
 can run some command on the system. Now if we are using it, its fine but if
 we want to give this program to a client application, it can have severe issues
 because client program can issue command to delete some system files or
 change some settings that you don’t want. Here a proxy class can be created
 to provide controlled access of the program.
 