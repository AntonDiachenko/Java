/* Inheritance [keyword: EXTENDS]

Inherit attributes and methods from one class to another. To inherit from a class, use the EXTENDS keyword. 
    superclass (parent) - the class being inherited from
    subclass (child) - the class that inherits from another class

//Advantages
Inheritance provides code reusability i.e, we can reuse attributes and methods while creating a new class.

//Final non-access modifier
If you don't want other classes to inherit from a class, use the 'final'
 keyword. */


//Example
class Vehicle {
  protected String brand = "Ford";        // Parent attribute
  public void honk() {                    // Parent method
    System.out.println("Tuut, tuut!");}
}

class Car extends Vehicle {
  private String modelName = "Mustang";          // Child attribute
  public static void main(String[] args) {
    Car myCar = new Car();                      // Child Object
    myCar.honk();                               // Child inheriting Parent method. o/p: Tuut, tuut!
    System.out.println(myCar.brand + " " + myCar.modelName);    --- Child inheriting Parent attribute. o/p: Ford Mustang}
}


