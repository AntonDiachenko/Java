import java.util.Scanner;

// CounterControlled.java
// Purpose: Solving the class average problem using Sentinel-controlled repetition.
/*
A class of specific number of students took a quiz. The grades (integers in the range 0–100) for this
quiz are available to you. Determine the class average on the quiz.
*/

// class declaration
public class SentinelControlled {
    // main method begins execution of java app
    public static void main(String[] args) {
        // 1. declaration phase
        // create an instance of the Scanner to obtain input from user
        Scanner myInput;
        // declare variables
        double total; // sum of grades entered3 by the user
        int gradeCounter; // Number of grade to be entered next
        double grade; // grade entered by user
        double average; // average students class

        // 2. Initialization phase
        myInput = new Scanner(System.in);
        total = 0;
        gradeCounter = 0;

        // 3. Processing Phase
        // prompt for input and read grade from user (possibly sentinel)
        System.out.print("Enter grades (0-100) or -1 to quit: ");
        grade = myInput.nextDouble(); // input next grade

        while (grade != -1) { 
            total += grade; // add grade to total
            gradeCounter++; // incement counter by 1

            // prompt for input and read grade from user (possibly sentinel)
            System.out.print("Enter grades (0-100) or -1 to quit: ");
            grade = myInput.nextDouble(); // input next grade    
        } // end loop while        
        
        // 4. Output (Termination) Phase
        if (gradeCounter != 0) {
            // cast gradeCounter to double value to calculate the average of grades
            average = total / (double) gradeCounter;
            // display total and average of grades
            System.out.printf("%nTotal of all grades is %.2f%n", total);
            System.out.printf("Class average is %.2f%n", average);        
        } // end if block
        else {
            // no grade were entered, so output appropriate message
            System.out.println("No grades were entered.");
        } // end else block

        // close scanner object
        myInput.close();
    } // end method main
} // end class CounterControlled