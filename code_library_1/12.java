package com.jac.answer;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		
		//answer1
		//input from user
		answer1();
		
		//answer2
		//printing something
		answer2(1,2);
		
		
		//answer3
		
		//FOR ? cannot be !!! because I don't know how many time I do division
		// WHILE ?
		
		//should I write a loop to take the numbers here?
		// NOOOO
		//try to do it with a number
			
		Scanner input = new Scanner(System.in);
		for (int i=0;i < 3; i++) {
			System.out.println("please enter a number to check");
			
			int number = input.nextInt();
			boolean result = isPalindrom(number);
			if (result) {
				System.out.printf("%d is palindrom %n", number);
			}
			else {
				System.out.printf("%d is not palindrom %n", number);
			}
		}
		
		
		//create a method to check if a number is palindrom and return boolean
		//123321 -> is palindrom
		//take 3 positive round numbers from user in the loop and check if those numbers are palindrom
		//isPalindrom(123321) -> print "it is";
		//isPalindrom(123) -> print "it is not";
	}
	
	public static boolean isPalindrom(int number) {
		int remainder = 0;
		int sum = 0;
		
		int temp = number ;
		
		while(number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number/10;
		}
		
		if (sum == temp) {
			return true;
		}
		return false;
	}
	
	//answer1
	public static void answer1() {
		//Array
		int[] xArr = new int[5];
		float[] YArr = new float[3];
		
	}
	
	//answer2 
	public static int answer2(int a, int b) {
		return a + b;
	}
	

}
