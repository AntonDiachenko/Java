import java.util.Scanner;

// create a method that returns the maximum of its three double parameters

public class MaxNumberV2 {
    // main method begins the execution of java app
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3;
        double result;

        // prompt for numbers
        System.out.println("Enter 3 numbers seperated with spaces");

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        // call the getMax() method
        result = getMax(num1, num2, num3);

        // display the max value
        System.out.println("the maximum value is " + result);
        
        // close scanner object
        input.close();        
    } // end method main

    // getMax method declaration

    /**
     * 
     * @param number1
     * @param number2
     * @param number3
     * @return
     *         returns the maximum of its three double parameters
     */
    public static double getMax(double number1, double number2, double number3) {
        double maxValue;
        maxValue = Math.max(number1, Math.max(number2, number3)) ;

        return maxValue;
        
    } // end method getMAx

} // end class MaxNumberV1
