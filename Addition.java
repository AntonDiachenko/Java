package addition;

// Addition.java
/**
 * 
 * Input two numbers of type double and
 * returns the sum
 * 
 */

/** 
    @author Anton
    @version 1.0
    @since March 9, 2022
*/


// import java package
import java.util.Scanner;

/**Addition class declaration */ 
public class Addition {
    /**main method begins execution of Java app */ 
    public static void main(String[] args) {
              
        // create reference variable of type scanner
        Scanner input;

        // create primitive type variables
        double number1;      // first number to add
        double number2;      // second number to add
        double sum;         // sum of number1 and number2

        // 2. Initialization phase
        input = new Scanner(System.in);

        // prompt the user to enter numbers
        // object_name.method_name()
        System.out.println("Please enter first number: ");
        number1 = input.nextDouble(); // read first number from user

        System.out.println("Please enter second number: ");
        number2 = input.nextDouble(); // read first number from user

        // 3. Processing phase
        sum = number1 + number2;

        // 4. Termination output Phase
        //System.out.println("The sum of number 1 and number 2 is " + sum);

        System.out.printf("%s%.2f%n", "The sum is ", sum);

        input.close();



    } // end method main
} // end class Addition
