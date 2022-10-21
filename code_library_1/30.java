package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int a = 0;
		bestGrade(a);

	}

	public static void bestGrade(int a) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students");
		int studentsNumber = input.nextInt();
		int highestGrade = 0;
		String bestStudent = "person";
		for (int i=0; i<studentsNumber; i++) {
			System.out.println("Enter a name");
			String studentName = input.next();
			System.out.println("Enter a grade");
			int studentGrade = input.nextInt();
				if(studentGrade>=highestGrade) {
					highestGrade=studentGrade;
					bestStudent=studentName;
				}
		}
		System.out.printf("Student %s has the best grade which is %d", bestStudent, highestGrade);
	}
		
}
				
		

