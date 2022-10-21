package com.jac.answer;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = input.next();
		
		System.out.println("Enter your last name");
		String lname = input.next();
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		printInfo(firstName, lname, age);
		
		printInfo(firstName, lname); //overloaded method
		
		System.out.println("Enter your salary");
		double salary = input.nextDouble();
		boolean check = checkSalary(salary);
		if (check) {
			System.out.println("you are rich");
		}
		else {
			System.out.println("you are not rich");
		}
		
	}
	
	
	//OVERLOADING
	//having methods with the same name but different parameters count or/and type
	public static void printInfo(String fname, String lname, int age) {
		System.out.printf("your name is %s and "
				+ "your last name is %s and you have %d year's old", 
				fname, lname, age);
	}
	 
	
	public static void printInfo(String fname, String lname) {
		System.out.printf("your name is %s and "
				+ "your last name is %s", 
				fname, lname);
	}
		
	public static boolean checkSalary(double salary) {
		if (salary >= 130000) {
			return true;
		}
		return false;
	}
		
	
	//create another method and ask the salary of the user
	//salary is double 
	//and in the method check if the salary is more than 130000
	//if yes return TRUE and print you are RICH
	//if False return false and print you are not RICH

}
