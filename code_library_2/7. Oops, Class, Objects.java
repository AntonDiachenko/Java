//Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

/* OOPS
faster and easier to execute
clear structure for the programs
keep Java code DRY "Don't Repeat Yourself" - Makes code easier to maintain, modify and debug
helps in making fully reusable applications with less code and shorter development time


//Classes and Objects
Class is a template for objects and an object is an instance of a class. When the individual objects are created, they inherit all the variables and methods from the class.
Class - car, fruit
Object - volvo, apple

In real life, a car is an object. The car has attributes such as weight and color and methods such as drive and brake. In a class, attributes are nothing but variables. */
public class Main {
  int x = 5;	//variable, attribute, fields

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);


/* static method - can be accessed without creating an object of the class.
public method - can only be accessed using objects. */

public class Main {
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod();



/*OOPS Concepts
//Encapsulation: [SET, GET]
Encapsulation helps to hide "sensitive" data from users. To achieve this:
1. declare class variables/attributes as private
2. provide public get and set methods to access and update the value of a private variable.


//Inheritance [Extends, Super class, Sub Class]
Inherit attributes and methods from one class to another. To inherit from a class, use the EXTENDS keyword. 
[METHOD OVERLOAD: Subclass inherit Superclass methods. Now, these methods can use same name in Subclass, but have different count of attributes, different data type etc. This is Method Overloading, a property of polymorphism]
[METHOD OVERRIDE: Subclass inherit Superclass methods. Now, these methods can use same name/ attribute, but different behaviour in Subclass. This is Method Overriding, a property of polymorphism]


//Polymorphism 
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.


//Abstraction [Abstract, Implements, Extends]
Data abstraction is the process of hiding certain details and showing only essential information to the user. Abstract class is a restricted class that cannot be used to create objects. To access the abstract class, it must be inherited from another class. 

An interface is a completely "abstract class" that is used to group related methods with empty bodies. The interface must be "implemented" by another class with the implements keyword. 
[METHOD OVERLOAD/ OVERRIDE: Interface Class has methods with empty body. The body of Methods are then created on the "implement" class and can be OVERLOADED/ OVERRIDDEN]

