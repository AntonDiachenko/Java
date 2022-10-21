// InputOutput.java

/**
 * Reads data from file, and display on the screen or
 * savs in a file
 */

 /**
  * @author Anton Diachenko
    @version 1.0
  */

  // import java package
  import java.util.*;
  import java.io.*;

  //declare InputOutput class
public class InputOutput {
    public static void main(String[] args) throws FileNotFoundException{
        // 1. declaration phase
        double length, width;           // length and width of a rectangle
        double radius;                  // radius of a circle
        String firstname, lastname;     // name of employee
        int age;                        // age of an employee
        double beginningBalance, interestRate; // begnining balance interest Rte of an account
        char ch;                        // character value

        double perimeter;
        double areaR, areaC;
        double circumference;
        double endOfMonthBalance;

        // reference variables
        Scanner inFile;
        PrintWriter outFile;

        // 2. Initialization Phase
        inFile = new Scanner(new FileReader("C:\\PC\\Antonio\\02 Montreal\\JohnAbbott\\courses\\420-JB4-AB PROGRAMMING II\\Java_II_Labs\\Java_II_Labs_03\\inData.txt"));
        outFile = new PrintWriter("C:\\PC\\Antonio\\02 Montreal\\JohnAbbott\\courses\\420-JB4-AB PROGRAMMING II\\Java_II_Labs\\Java_II_Labs_03\\outData.txt");

        // width and length of the rectangle
        width = inFile.nextDouble();
        length = inFile.nextDouble();

        // radius of the circle
        radius = inFile.nextDouble();

        // first and last name
        firstname = inFile.next();
        lastname = inFile.next();
        age = inFile.nextInt();

        // begnining balance interest Rte of an account
        beginningBalance = inFile.nextDouble();
        interestRate = inFile.nextDouble();

        // character ch
        ch = inFile.next().charAt(0);

        // 3. Processing phase
        perimeter = 2 * (length + width);
        areaR = length * width;
        areaC = Math.PI * Math.pow(radius, 2);    // area of a circle
        circumference = 2 * Math.PI * radius; 
        
        // calculate end of month balance
        endOfMonthBalance = beginningBalance * (1 + interestRate / (12 * 100) );

        // 4. Termination phase

        // rectangle values
        outFile.printf("Rectangle: %nlength = %.2f, Width = %.2f" + 
        ", Area = %.2f, Perimeter = %.2f %n%n", length, width, areaR, perimeter);

        // circle values
        outFile.printf("Circle: %nRadius = %.2f, Area of Circle = %.2f, " +
        "Circumference = %.2f %n%n", radius, areaC, circumference );

        // employee info
        outFile.println("Employe Name: " + firstname + " " + lastname + ", age: " + age);

        // account info
        outFile.printf("Beginning Balance = $%,.2f"
                        + ", Interest RATE  = %.2f%n"
                        + "Balance at the end of the month = $%,.2f %n%n", 
                        beginningBalance, interestRate, endOfMonthBalance);

        // character value
        outFile.println("The character that comes after " + ch + "in the ASCII set is " +
        (char)((int)(ch)+2));

        // close the infile and outfile objects
        inFile.close();
        outFile.close();


 


    } // end of main method
} // end class InputOutput
