package com.jac.example;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// Switch and case

		int a = 15;

//		if (a == 1) {
//			System.out.println("a is 1");
//		}
//		if (a == 2) {
//			System.out.println("a is 2");
//		}
//		if (a == 3) {
//			System.out.println("a is 3");
//		}
//		if (a == 4) {
//			System.out.println("a is 4");
//		}
//		if (a == 5) {
//			System.out.println("a is 5");
//		}

//		switch (variable or an integer expression)
//		{
//		     case constant:
//		     //Java code
//		     ;
//		     case constant:
//		     //Java code
//		     ;
//		     default:
//		     //Java code
//		     ;
//		}

		switch (a) {
		case 1:
			int ttt = 12;
			System.out.println("a is 1");
			break; // is for getting out of switch
		case 2:
			System.out.println("a is 2");
		case 3:
			System.out.println("a is 3");
		case 4:
			System.out.println("a is 4");
		case 5:
			System.out.println("a is 5");
			// in all the conditions it goes to default
			// even if it does does not go to any case
		default:
			System.out.println("default");

		}

		// TODO ask use to enter a character
		// and check if it is a vowel or not
		// switch case is only for checking a variable with
		// multiple constants
		char x = 'a';
		switch (x) {
		case 'a':

			System.out.println("it is a vowel");
		case 'e':
			System.out.println("it is a vowel");
		}
		
		System.out.println("please enter a character");
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0); // getting the character from user
		switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("it is a vowel");
		}

	}
}
