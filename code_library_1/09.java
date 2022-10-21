package com.jac.answer;

import java.util.Scanner;

public class Answe4 {
	//...args
	public static void main(String[] args) {
//		Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

		//WooHoo -> Woo
		//HelloThere => Hello
		//abcedf => abc
		
		//find the half index
		//CHOP CHOP your string
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Ask user to enter string");
		String str1 = input.next();
		
		int halfIndex = str1.length() / 2;
		
		System.out.println(str1.substring(0, halfIndex));
	}
}
