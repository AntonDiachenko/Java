import java.util.Scanner;

// Enumeration.java
// Purpose: Rate movies as Excellent, Average, or Bad

/**
 * @author: Anton Diachenko
 * @date: March 9, 2022
 * @lastchanged:
 * @update:
 */

public class Enumeration {
    // create an enumeration rating values
    public enum MovieRating {
        E, // Excellent
        A, // Average
        B, // Bad
    } // end numb

    // main method begins execution of java app
    public static void main(String[] args) {
        // declare a reference variable
        Scanner input = new Scanner(System.in);
        String movieRating;

        // declare a variable rating
        MovieRating rating;

        // prompt the user for rating value
        System.out.println(
                "Enter (E)xellent, (A)verage, or (B)ad to rate the movie: ");

        movieRating = input.nextLine();
        rating = MovieRating.valueOf(movieRating);

        switch (rating) {
            case E: // Excellent
                System.out.print("You have rated the movie " + rating + ". ");
                System.out.println("You must see this movie!");
                break;
            case A: // Average
                System.out.print("You have rated the movie " + rating + ". ");
                System.out.println("This movie is OK, but not great");
                break;
            case B:
                System.out.print("You have rated the movie " + rating + ". ");
                System.out.println("Skip it!");
                break;
            default:
                System.out.println("Default message - something is wrong.");
        } // end switch

        
    // close scanner object
    input.close();

    
    rating = MovieRating.B;
    System.out.println("Movie rating is " + rating);
    }
}
