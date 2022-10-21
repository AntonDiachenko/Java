package midterm_task3;

import java.util.Scanner;

public class Midterm_task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your letter grade:");
		String userLetterGrade = input.next();
		
				
		switch (userLetterGrade) {
		case 1:
			System.out.println("GPA for A is 4.0");
			break;
		case 2:
			System.out.println("GPA for A- is 3.7");
			break;
		case 3:
			System.out.println("GPA for B+ is 3.3");
			break;
		case 4:
			System.out.println("GPA for B is 3.0");
			break;
		case 5:
			System.out.println("GPA for B- is 2.7");
			break;
		case 6:
			System.out.println("GPA for C+ is 2.3");
			break;
		case 7:
			System.out.println("GPA for C is 2.0");
		case 8:
			System.out.println("GPA for C- is 1.7");
			break;
		case 9:
			System.out.println("GPA for D is 1");
			break;
		case 10:
			System.out.println("GPA for F is 0");
			break;
			
		}
		

	}

}
