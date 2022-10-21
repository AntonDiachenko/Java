package test;

//import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
				
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String usename1 = input.nextLine();
		System.out.println("Enter your last name");
		String usename2 = input.nextLine();
		System.out.println("Enter your age");
		int userAge = input.nextInt();
		
		printInfo(usename1, usename2, userAge);
		
		
		System.out.println("Enter your salary");
		double userSalary = input.nextDouble();
		boolean truth = check(userSalary);
		if (truth) {
			System.out.println("you are RICH");
		} else {
			System.out.println("you are not RICH");
		}
		
		
	}
	public static void printInfo(String fname, String lname, int age) {
		System.out.printf("Hello %s %s, you are %d age old %n%n", fname, lname, age);
		
	}
	
	public static boolean check(double userSalary) {
		double test = 130000;
		if (userSalary == test) {
			return true;
		} else {
			return false;
		}
		
		
	} 
	
}
