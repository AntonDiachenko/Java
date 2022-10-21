package com.jac.answer;

import java.util.Scanner;

public class Answer3 {
	public static void main(String[] args) {
		//Given a string, return a "rotated left 2" 
		//version where the first 2 chars are moved to the end. 
		//The string length will be at least 2.
		
		//"Hello" -> "lloHe"
		//java => vaja
		//Hi -> Hi
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Ask user to enter string");
		String str1 = input.next();
		
		//Take the first 2 chars and put it somewhere
		//Take the rest of the string . keep it somewhere
		//attach them
		
		String first2Chars = str1.substring(0, 2);
		String secondPart = str1.substring(2);
		
		String result1 = secondPart+first2Chars;
		String result2 = secondPart.concat(first2Chars);
		
		//System.out.printf("%s and %s" , first2Chars, secondPart);
		System.out.printf("%s%s" , secondPart, first2Chars);
		
	}
}
