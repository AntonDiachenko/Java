import java.util.Scanner;

// WeeklyWages.java

/* Purpose: determine the employee weekly wages. If the hours worked 
exceed 40, then wages include overtime payment (rate = 1.5). */

public class WeeklyWages {
    // declare an instance of class Scanner
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaration Phase
        double wages, hourlyRate, hours;
        final double Extra_Rate = 1.5;

        // initialization Phase
        System.out.println("Enter the working hours");
        hours = console.nextDouble();
        System.out.println();

        System.out.println("Enter the pay rate");
        hourlyRate = console.nextDouble();
        System.out.println();

        // Processing Phase
        // if the employee works more than 40 hours, the rate will be 1.5
        if (hours > 40.0) {
            wages = (40 * hourlyRate) + (hours - 40) * hourlyRate * Extra_Rate;
        } // end if
        else {
            wages = (hours * hourlyRate);      
        } // end else 

        // Output Phase
        System.out.printf("The wages are $%.2f%n", wages);
        System.out.println();

    } // end method main
} // end class
