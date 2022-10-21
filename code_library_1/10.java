package com.jac.answer;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		
//		 Given a string, return true if it ends in "ly".
		Scanner input  = new Scanner(System.in);
		System.out.println("Ask user to enter a value");
		String str = input.next();
		//oddly => true;
		//y => false
		//oddy => false
		
		//check the size
		int size = str.length();
		if (size < 2) {
			System.out.printf("false");
		}
		else {
			//check last 2 chars of a string
			//johnwick => size = 8 and index of c = 6
			String last2Chars = str.substring(size - 2);
			if (last2Chars.equals("ly")) {
				System.out.printf("TRUE");
			}
			else {
				System.out.printf("false");
			}
		}
	}

}
