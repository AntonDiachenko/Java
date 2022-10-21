// BreakForCounter.java
// Counter-controlled repetition with the for repetition statement

// class declaration 
public class ContinueForCounter {
    static final int MAX_NUMBER = 10;

    public static void main(String[] args) {
        // 1. declare control variable
        // int counter;
        // for statement header includes initialization,
		// loop-continuation condition and increment
        for (int counter = 1; counter <= MAX_NUMBER; counter++) {
             // skip the iteration value and continue looping when counter =  5
            if (counter == 5) {
                continue;  // terminates loop if counter = 5
            }
            System.out.printf("%d ", counter);
        }// end for loop

    } // end method main
} // end class BreakForCounter
