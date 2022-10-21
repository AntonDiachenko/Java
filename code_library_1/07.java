package com.jac.example;

import java.util.Scanner;

public class Answer2 {
	public static void main(String[] args) {
		/* Given two strings, append them together (known as "concatenation") and 
		 * return the result. However, if the concatenation creates a double-char, 
		 * then omit one of the chars, so "abc" and "cat" yields "abcat".
		 */
		
		// "abc" and "cat" => "abcat"
		//"dog" and "cat" => "dogcat"

		Scanner input  = new Scanner(System.in);
		System.out.println("Ask user to enter 1st string");
		String str1 = input.next();
		
		System.out.println("Ask user to enter 2nd string");
		String str2 = input.next();
			
		//check if the last char of first string 
		//is the same as first char of the second string
		//then concat only one of them
		

		//IndexOutOfBound Exception happens when you want to reach
		//an element outside the size
		char lFString = str1.charAt(str1.length() - 1);
		char fLString = str2.charAt(0); //gives an error for empty string
		
		if (lFString == fLString) {
			//System.out.println(str1.concat(str2.substring(1)));
			System.out.println(str1 + str2.substring(1));
		}
		else {
			System.out.println(str1 + str2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
