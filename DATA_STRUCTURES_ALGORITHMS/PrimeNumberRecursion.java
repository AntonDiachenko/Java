/*
 Write a Boolean return method that check whether a given positive integer is prime 
 or not using recursive algorithm.
 */

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int number, divisor;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a number");
		number = myScanner.nextInt();
		
		System.out.println(checkIfPrime(number, 2));
		
		
	}
	
	public static boolean checkIfPrime(int num, int divisor) {
		       
		// Base case
        if (num == 2) {
        	return true;
        }
        if (num < 2) {
        	return false;
        }
        
        if (divisor * divisor > num) {
        	return true;
        }        
        
        if (num % divisor == 0) {
        	return false;
        }
            
        // Check for next divisor
        return checkIfPrime(num, divisor + 1);
    }
		
	
}
