package com.jac.example;

import java.util.Scanner;

public class ExampleDay7 {

	//main method
	public static void main(String[] args) {
		
		for(int i= 0 ;i < 4; i++) {
			printValue();
		}
//		printValue();
//		printValue();
//		printValue();
//		printValue();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int val1 = input.nextInt();
		
		System.out.println("Please enter second number");
		int val2 = input.nextInt();
		
		//since val1 and val2 are "INT", they can be sent as parameter
		
		//sum("tea", 't');
		
		sum(val1, val2);
		
//		int sum = val1 + val2;
//		System.out.printf("The result is %d = ", sum);
	
	}
	
	//methods start with lowercase
	//this methods has no parameter
	public static void printValue() {
		//scope of variables
		//in the methods each variable will be initialized again
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		int grade = input.nextInt();
		System.out.println("your grade is =" + grade);
	}
	
	//this method has 2 parameters
	//parametrs name can be anything
	public static void sum(int a, int b) {
		int sum = a + b;
		System.out.printf("The result is %d = ", sum);
			
	}
	
	
	

}
