/*A method is a block of code which only runs when it is called. Methods are used to perform certain actions, and they are also known as functions.
  Static method - can be accessed without creating an object of the class. Static method belongs to the Main class and not to an object of the Main class. 
  Public method - can only be accessed using objects. So need to create an object first (mbObj)and call method (myObj.myMethod());

// public static void main(String args[]) Method
The point from where the program execution starts or simply the entry point of Java programs is the main() method

public - It is an Access modifier. Making the main() method public makes it globally available and JVM can access it.If we use private, protected, and default before the main() method, it will not be visible to JVM.

static - Static methods are the method that can be called without creating objects. We need to call the main() method without creating an object. The main() method is static so that JVM can invoke it without instantiating the class.

void - return type. As the main() method doesn’t return anything, its return type is void.

main - It is the name of the Java main method. JVM looks for this as the starting point of the java program. It’s not a keyword

String[] args - Java Command-Line Arguments. agrs[] is the array name and it is of String type. It means that it can store a group of string. Remember, this array can also store a group of numbers but in the form of string only. Values passed to the main() method is called arguments. These arguments are stored into args[] array, so the name args[] is generally used for it.


void - means that this method does not have a return value.
myMethod() - name of the method */

public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }
  public static void main(String[] args) {
    myMethod();


/* You can pass data(parameters) into a method. Parameters act as variables inside the method and are seperate with a comma.
void - indicates the method should not return a value. To return value, use int, char, boolean etc instead of void and use the return keyword. */

static void myMethod(String fname, int age) {



