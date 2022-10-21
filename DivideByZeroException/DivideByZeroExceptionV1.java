package DivideByZeroException;

import java.util.Scanner;

// what happens when errors arise in app that does not use exception handling

public class DivideByZeroExceptionV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int numerator, denominator, result;
        int numerator, denominator, result;
        System.out.println("Enter an integer numerator");
        numerator = input.nextInt();

        System.out.println("Enter an integer denominator");
        denominator = input.nextInt();

        result = quotient(numerator, denominator);
        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

        // close scanner object
        input.close();


    } // end method main

// throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator) {
    return numerator / denominator; // possible division by zero
    }

}
