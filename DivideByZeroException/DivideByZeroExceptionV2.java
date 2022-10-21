package DivideByZeroException;

import java.util.Scanner;

// what happens when errors arise in app that does not use exception handling

public class DivideByZeroExceptionV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numerator, denominator, result;
        System.out.println("Enter an integer numerator");
        numerator = input.nextDouble();

        System.out.println("Enter an integer denominator");
        denominator = input.nextDouble();

        result = quotient(numerator, denominator);
        System.out.printf("%nResult: %.2f /%.2f = %.2f%n", numerator, denominator, result);

        // close scanner object
        input.close();


    } // end method main

// throwing an exception when a divide-by-zero occurs
    public static double quotient(double numerator, double denominator) {
    return numerator / denominator; // possible division by zero
    }

}
