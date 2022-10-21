/*
 Design a class that contains a recursive method with the return type as long, 
 to find the sum of all odd numbers up to a given integer taken as parameter. For example:
Input1: 14. Output: 1+3+5+7+9+11+13= 49
In the main method of the same class, let the user enter a number N 
(do the input validation to ensure that an integer was entered), 
then call the recursive method to return the sum of odd numbers up to N.
 */

import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);	
        
		System.out.println("Enter an integer: ");
        long myLong = myScanner.nextInt();
        System.out.println("The sum of odd numbers = " + getSumOfOdd(myLong));
        
        myScanner.close();
    }
	
    public static long getSumOfOdd(long l)
    {
        if (l == 0)
            return l;
        if (l % 2 != 0){
        	System.out.println(l);
            return (l+getSumOfOdd(l-1));
        }
        return (getSumOfOdd(l-1));

    }
}
