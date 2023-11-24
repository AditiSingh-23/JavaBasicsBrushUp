# JavaBasicsBrushUp

//Here are some important pts to be considered for someone who is new to Java 

Instead Of Scanner Class for taking an input from User 
if we use BufferReader class then the execution becomes faster


    //protected members cannot be used from main method
    //to create protected members Object making is not required


constructor chaining :

when any constructor is called of Derived class(Child class) , firstly Parent Class Constructor will be called , this is called Constructor Chaining.

Abstract Class:

-must be declared with an abstract keyword.
> can have abstract and non abstract methods;
> cannot be instansiated
> It can have parametrized constructors ,default constructor are by default present ,no need to make and static methods also we can define .
> It can have final methods which will force the subclass not to change the body of the method.

//Static Methods and properties:
when we want to save memory and there is a common value allocated to any variable:
static can be used

//because static chejo ko memory ek hi bar allocate hoti hai
//and objects k lie memory bar bar create hoti hai


The main purpose of OOPS concept is to provide Systematic way of Programming.


Integer.MAX_VALUE
Integer.MAX_VALUE is a constant in the Integer class of java.lang package that specifies that stores the maximum possible value for any integer variable in Java. The actual value of this is
2^31-1 = 2147483647
Any integer variable cannot store any value beyond this limit. Upon doing so, the memory will overflow and the value will get negative.

Integer.MIN_VALUE
Integer.MIN_VALUE is a constant in the Integer class of java.lang package that specifies that stores the minimum possible value for any integer variable in Java. The actual value of this is
-2^31 = -2147483648
Any integer variable cannot store any value below this limit. Upon doing so, the memory will overflow and the value will get positive.
