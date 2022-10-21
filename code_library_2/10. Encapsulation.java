/* Encapsulation - [PRIVATE Variables, PUBLIC VOID SET Method, PUBLIC GET METHOD]

Encapsulation helps to hide "sensitive" data from users. To achieve this:
1. declare variables/attributes as private
2. provide public get and set methods to access and update the value of a private variable.

The get method returns the variable value, and the set method sets the value. Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case.

//Advantages
Better control of class attributes and methods.
Class attributes can be made read-only (only use get method), or write-only (only use set method).
Can change one part of the code without affecting other parts.
Increased security of data. */


//Example
//file 1
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }
  // Setter
  public void setName(String name1) {
    this.name = name1;

//file 2
public class dataLoad {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.getName();
        myObj.setName("John");
        System.out.println(myObj.getName());


