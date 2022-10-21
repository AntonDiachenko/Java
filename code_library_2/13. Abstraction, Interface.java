/* Abstraction  [ABSTRACT CLASS, REGULAR/ ABSTRACT METHOD][keywords: EXTENDS, IMPLEMENTS]

Data abstraction is the process of hiding certain details and showing only essential information to the user. To access the abstract class, it must be inherited from another class.

The abstract keyword is a non-access modifier, used for classes and methods. Abstraction can be achieved with either: 
1) abstract classes or 
2) interfaces. 

//Advantages
To achieve security - hide certain details and only show the important details of an object.


// Abstraction using Abstract Class, Regular/ Abstract Methods
An abstract class can have both abstract and regular methods.

Abstract class: is a restricted class that cannot be used to create objects. To access the abstract class, it must be inherited from another class. 

Abstract method: can only be used in an abstract class and it does not have a body. The body is provided by the subclass. */


abstract class Animal {
  public abstract void animalSound();			--- abstract method
  public void sleep() {							--- regular method
    System.out.println("Zzz");}
}
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");}		--- body of animalSound()
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); 								--- Create a Pig object
    myPig.animalSound();								--- o/p: The pig says: wee wee
    myPig.sleep();										--- o/p: Zzz
  }
}



/* Abstraction using Interfaces
An interface is a completely "abstract class" that is used to group related methods with empty bodies. The interface must be "implemented" by another class with the implements keyword. The body of the interface method is provided by the "implement" class.


// Advantages
1) To achieve security - hide certain details and only show the important details of an object

2) Java does not support "multiple inheritance". A class can only inherit from one superclass. This can be achieved with interfaces as a class can implement multiple interfaces.
	class DemoClass implements FirstInterface, SecondInterface{...}			*/


interface Animal {
  public void animalSound(); 			--- interface method (does not have a body)
  public void sleep(); 					---	interface method (does not have a body)
}
class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");	--- body of animalSound()
  }
  public void sleep() {
    System.out.println("Zzz");						--- body of sleep()
 }}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  			--- Create a Pig object
    myPig.animalSound();				--- o/p: The pig says: wee wee
    myPig.sleep();						--- o/p: Zzz
    Animal ani2 = new Animal();			--- o/p: Error.Animal is abstract; cannot instantiate 
    ani2.sleep();
    Pig myPig2 = new Pig();
    myPig2.sleep();						--- o/p: Zzz
 }}


/* Notes
Interface methods are by default  public and abstract
Interface attributes are by default public, static and final
eg: interface printable{
	int num1 = 5;			--- compiler treats as: public static final num1 = 5;
	void print();}			--- compiler treats as: public abstract void print();

After implementing interface, all of its methods are OVERRIDDEN
ABSTRACT classes and INTERFACES cannot be used to create objects
Interface methods do not have a body - the body is provided by the "implement" class
An interface cannot contain a constructor (as it cannot be used to create objects)
*/