package com.jac.example;

import java.util.Scanner;

public class ExampleDay72 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int val1 = input.nextInt();
		
		System.out.println("Please enter second number");
		int val2 = input.nextInt();
		
		System.out.printf("The result is of running sum1 %n");
		sum1(val1, val2);
			
		int result = sum2(val1, val2);
		System.out.printf("The result is of running sum2 %n");
		System.out.printf("The result is  = %d %n", result);	
		
		//cast the numbers and pass it to the method
		float avg = avg(val1, val2);
		System.out.printf("The result is  = %f %n", avg);
	}
	
	//no input and no return output => input means parameter and output means return value
	public static void printValue() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		int grade = input.nextInt();
		System.out.println("your grade is =" + grade);
	}
	
	//input and no return output
	public static void sum1(int a, int b) {
		int sum = a + b;
		System.out.printf("The result is = %d %n", sum);		
	}
	
	//input and return output
	public static int sum2(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	public static float avg(float a, float b) {
		return (a + b) /2 ;
	}
	
	//use this method to take information from user
	public static void printInfo(String fname, String lname, int age) {
		// print the information
	}
	
	//create another method and ask the salary of the user
	//salary is double
	//and in the method check if the salary is more than 130000
	//if yes return TRUE and print you are RICH
	//if False return false and print you are not RICH
	
	
	
	
	
}
