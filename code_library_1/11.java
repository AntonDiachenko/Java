package com.jac.example;

import java.util.*;
import java.lang.*;

public class StringExamples {

	public static void main(String[] args) {
				
		//Primitive
		byte b = 3;
		int a = 12;
		long c = 20;
		float x = 2.8f;
		double y = 4.7;
		boolean boo = false;
		
		Scanner input= new Scanner(System.in); //make an instance or reference variable
		
		//STRING
		String str1 = new String(); //Class instantiation
		str1 = "Test1"; //initialize
		
//		System.out.println(str1);
		
		String str2 = new String("Test2"); // Class instantiation
//		System.out.println(str2);
		
		String str3 = "Test3"; //is perfect
		
			
//		System.out.println("value of index 0 =" + index0 
//				+ " and value of index 5 = " + index5);
		
		//printf => formatted print
		int variable1 = 12;
		System.out.println("my variable is " + variable1); // hard approach
		System.out.printf("my variable is %d %n", variable1); // GO with this one
	
		float variable2 = 3.467f;
		//there is no compile error but
		//at runtime it will throw an exception
		//% shows the format of the argument and 
		//you can ask how many floating point you are expecting
		//also you can ask for the space before that argument
		System.out.printf("my variable is %20.3f %n", variable2);
		
		// % n goes to the next line
		
		float arg1 = 5.678f;
		float arg2  = 8.9999f;
		System.out.printf("the arg1 value is %40.3f "
				+ "and arg2 value is %2.4f %n", arg1, arg2);
		
		
		double arg3 = 4.7777;
		double arg4 = 4.7777;
		System.out.printf("value arg3 is %20.4f %n", arg3);
		
		
		char ch = 'a';
		System.out.printf("the value of character is %c %n", ch);
		
		String formattedString = "Java is the best language in the world";
		System.out.printf("%30.6s%n", formattedString);
	
		String welcome1 = "Welcome to";
		String welcome2 = "Java programming";
		String welcome3 = "in AEC";
		
		//Welcome to 
		//java programming in AEC
		//System.out.printf();
		
		System.out.printf("%s%n%s %s%n", welcome1, welcome2, welcome3);
		
		
		//FLAG examples
		//% [flags] [width] [.precision] conversion-character
		int digit = 56;
		System.out.printf("%015d%n", digit);
		
		long digit2 = 4000000000000000L;
		System.out.printf("%,d%n", digit2);
		

		//String methods
		String college = "JohnAbbott";
		//String is an Array of Characters
		char index0 = college.charAt(0);
		char index5 = college.charAt(5);

		System.out.printf("the value of index 0 %c"
				+ " and the value of index 5 is %c%n", index0, index5);
		String name1 = "MAX";
		String name2 = "RiC";
		System.out.printf("%d%n", (int)'M');
		System.out.printf("%d%n", (int)'m');
		//compare
		//We don't reinvent the wheel
		int res =name1.compareTo(name2);
		if (res > 0) {
			System.out.printf("name 1 is greater than 2 %n");
		}
		if (res<0) {
			System.out.printf("name 1 is less than 2 %n");
		}
		else {
			System.out.printf("strings are equal %n");
		}
		
		//when you call a method in string
		//it does NOT change the string itself
		String concattedString = name1.concat(" is my friend");
		System.out.println(concattedString);
		System.out.println(name1);
		
		//we can find the index of a character
		int index = college.indexOf('A');//4
		System.out.println(index);
		int length = college.length(); //10
		System.out.println(length);
		
		// NEW STRING !!!!! the old one stays as it was
		String smallA = college.replace('A', 'a');
		
		String sentence = "I like programming with Eclipse";
		//Array NOT NOW => wait until next week
		String[] words = sentence.split(" ");
		
		String choppedString1 = college.substring(3);
		System.out.println(choppedString1);
		
		String choppedString2 = college.substring(3, 8);
		System.out.println(choppedString2);
		
		//EQUAL
		String fname = "Reza";
		System.out.printf("Please guess teacher's name %n");
		String guess = input.next();
		//check if the user could guess my name
		//For comparing equality of 2 objects we use EQUALS and not ==
		//ONLY for primitive we can use ==
		//String is an exception and it is not like primitive and it uses
		//Reference variable
		
//		if (guess.equals("Reza")) {
//			System.out.printf("You are genious %n");
//		}
//		else {
//			System.out.printf("You are not smart %n");
//		}
		
		if (guess.equalsIgnoreCase("reza")) {
			System.out.printf("You are genious %n");
		}
		else {
			System.out.printf("You are not smart %n");
		}
		
	}

}
