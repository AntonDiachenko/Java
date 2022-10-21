/*Constructor
The constructor is called when an object of a class is created. It can be used to set initial values for object attributes. Note that the constructor name must match the class name, and it cannot have a return type (like void). All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes. */

public class Main {
  int x;  // Create a class attribute
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }
  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // 5


// No Arguments constructor is created by java by default.
  public class Main {
    int x;  // Create a class attribute

    public static void main(String[] args) {
      Main myObj = new Main(); // In this case, we didnt create the No Argument constructor (public Main(){..} ) . But Java created 1 by default and hence we can create an object this way.



 // Constructor Parameters
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }
  public static void main(String[] args) {
    Main myObj = new Main(5); // calls constructor. y is 5, then x = y.
    System.out.println(myObj.x);


 // More than 1 Parameters
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);



/*METHOD VS CONSTRUCTOR
Constructor takes same name as class.
No return type like void


Method can also take same name as a Class, but its not recommended.
Always have a return type
public class Person {
  public Person() {}    // constructor
  public void Person() {} // method

*/