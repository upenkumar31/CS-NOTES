# **JAVA OOPS**

1. Object
2. Encapsulation
3. Polymorphism
4. Inheritance
5. Abstraction

## **Object**

There are three steps when creating an object from a class −

**Declaration** − A variable declaration with a variable name with an object type.

**Instantiation** − The 'new' keyword is used to create the object.

**Initialization** − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.

RealLife Example: 3 cars of same model then we have 3 object of same car

## **Encapsulation**

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

**To achieve encapsulation in Java −**

* Declare the variables of a class as private.
* Provide a public setter and getter methods to modify and view the variables values.

**Benefits of Encapsulation**

1. The fields of a class can be made read-only or write-only.
2. A class can have total control over what is stored in its fields.


## **Polymorphism**

Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.

If you overload a static method in Java, it is the example of compile time polymorphism

## **Inheritance**

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

## **Abstraction**

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

Ways to achieve Abstraction
There are two ways to achieve abstraction in java

Abstract class (0 to 100%)
Interface (100%)

* An abstract class must be declared with an abstract keyword.
* It can have abstract and non-abstract methods.
* It cannot be instantiated.
* It can have constructors and static methods also.
* It can have final methods which will force the subclass not to change the body of the method.