/*Polymorphism [Method with same name but different - attribute count, attribute  type, attribute behaviour. Over-loading, Over-riding] 

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.


//Advantages
Polymorphism also provides code reusability i.e, we can reuse attributes and methods while creating a new class.  */


//Example
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();			  --- o/p: The animal makes a sound
    myPig.animalSound();			    --- o/p: The pig says: wee wee
    myDog.animalSound();			    --- o/p: The dog says: bow wow
  }
}


/*Method Overloading  - Compile Time Polymorphism
A class can have multiple methods with same name but with different parameters. This is called as Method Overloading. There are two ways to overload the method in java
1) By changing number of arguments
2) By changing the data type */

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  int myNum1 = plusMethod(8, 5, 7);
  double myNum1 = plusMethod(4.3, 6.26);

static int plusMethod(int x, int y) {
  return x + y; }
static int plusMethod(int x, int y, int z) {
  return x + y + z; }
static double plusMethod(double x, double y) {
  return x + y; }

  
/* Method Overriding - Run Time Polymorphism or Dynamic
A subclass can have the same method as declared in the parent class. This is known as Method Overriding. */
@Override
public String toString() {
    return String.format("%s %s %n%s: %s %n%s: %s", getFirstName(), getLastName(), "Email", getEmail(), "Address", getAddress());
}
/* o/p:
David Smith 
Email: j.s@gmail.com 
Address: 123 Montreal 
*/