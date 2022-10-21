import java.util.Scanner;

// CounterControlled.java
// Purpose: Solving the class average problem using counter-controlled repetition.
/*
A class of ten students took a quiz. The grades (integers in the range 0–100) for this
quiz are available to you. Determine the class average on the quiz.
*/

public class CounterControlled {
    // main method begins execution of java app
    public static void main(String[] args) {
        // create an instance of the Scanner to obtain input from user
        Scanner myInput;
        // declare variables
        double total; // sum of grades entered by the user
        int gradeCounter; // Number of grade to be entered next
        double grade; // grade entered by user
        double average; // average students class
        int studentNumber;

        // 2. Initialization phase
        myInput = new Scanner(System.in);

        total = 0;
        gradeCounter = 1;

        System.out.print("Enter student number: ");
        studentNumber = myInput.nextInt();

        // 3. Processing Phase
        while (gradeCounter <= studentNumber) { // loop 10 times
            System.out.print("Enter grades (0-100): ");
            grade = myInput.nextDouble(); // input next grade
            total = total + grade; // total += grade - add grade to total
            gradeCounter++;
        } // end loop while

        // calculate average
        average = total / studentNumber;

        // 4. Output (Termination) Phase
        // display total and average of grades
        System.out.printf("%nTotal of all " + studentNumber + " students is %.2f%n", total);
        System.out.printf("Class average is %.2f%n", average);

        // close scanner object
        myInput.close();
    } // end method main
} // end class CounterControlled
