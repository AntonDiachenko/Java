/*
 Write a method that accepts any positive integer and return the sum of its digits 
 using recursive algorithm. The method must be called in a main method based on an any integer.
e.g. method(1234) should return 1+2+3+4=10.
 */

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int userNum = myScanner.nextInt();
		
		System.out.println("Sum of digits in your number is " + getSum(userNum));
	}
	
	
	
	public static int getSum(int number) {
		if (number < 10) {
			return (number);
		} else {
			return (number % 10) + getSum(number / 10);
		}
		
	}
	
}
