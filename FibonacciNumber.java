import java.util.Scanner;

public class FibonacciNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstFibNum;
        int secondFibNum;
        int nthFibNum;

        System.out.print("Please enter the first Fibonacci number: ");
        firstFibNum = scanner.nextInt();
        System.out.println();

        System.out.print("Please enter the second Fibonacci number: ");
        secondFibNum = scanner.nextInt();
        System.out.println();

        System.out.println("Enter the position of the desired number " +
        "in the Fibonacci \nsequence: ");
        nthFibNum = scanner.nextInt();
        System.out.println();

        System.out.println("The " + nthFibNum + "th Fibonacci number of the " +
        " sequence is: " + rFibNumber(firstFibNum, secondFibNum, nthFibNum));
    } // end method main 

    // method rFibNumber 
    public static int rFibNumber(int firstNumber, int secondNumber, int number) {
            if (number == 1) {
                return firstNumber;
            } else if (number == 2 ) {
                return secondNumber;
            } else {
                return rFibNumber(firstNumber, secondNumber, number - 1) + 
                    rFibNumber(firstNumber, secondNumber, number - 2);
            }
    } // end method rFibNumber



} // end class 
