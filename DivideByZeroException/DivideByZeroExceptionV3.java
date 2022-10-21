package DivideByZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

// use exception handling to process ArithmeticException
// InputMismatchException that arise.

public class DivideByZeroExceptionV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueLoop = true; // determined if more input is needed
        int numerator, denominator, result;

        do {
            try { // read the numbers and calculate quotient
                System.out.println("Enter an integer numerator");
                numerator = input.nextInt();
        
                System.out.println("Enter an integer denominator");
                denominator = input.nextInt();
        
                result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

                continueLoop = false; // input successful end looping
            } // end try block
            
            catch (InputMismatchException ime) {
                System.err.printf("%nException: %s%n", ime);
                input.nextLine(); // discard input, so user can try again
                System.out.printf("You must enter integers. Try again.%n%n");
            }
            catch(ArithmeticException ae){
                System.err.printf("%nException: %s%n", ae);
                System.out.println("Zero is an invalid denominator. Try again. %n%n");
            }
        } while(continueLoop);


        // close scanner object
        input.close();


    } // end method main

// throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator) {
    return numerator / denominator; // possible division by zero
    }

}
