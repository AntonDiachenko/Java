/* Java Packages & API
The Java API is a library of prewritten packages. A package can be considered as a group of classes. Packages are divided into two categories:
Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)

Built-in Packages
can import either a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package. */

// Import the whole package
import package.name.*;   
import java.util.*;

// Import a single class
import package.name.Class;   
import java.util.Scanner; //java.util is a package, while Scanner is a class of the java.util package.


/* User-defined Packages
To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:
└── root
  └── mypack
    └── MyPackageClass.java		*/

// Create Package
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");

//Save the file as MyPackageClass.java, and compile it
C:\Users\Your Name>javac MyPackageClass.java
C:\Users\Your Name>javac -d . MyPackageClass.java  //d - destination to save file

//To Run
C:\Users\Your Name>java mypack.MyPackageClass


/* Output
This is my package!  */
