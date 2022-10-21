package midterm_task1;

import java.util.Scanner;
import java.lang.*;

public class Midterm_task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter your first name");
		String userFirstName = input.next();
		
		System.out.println("Please Enter your last name");
		String userLasttName = input.next();
		
		System.out.println("Please Enter your age");
		int userAge = input.nextInt();
		
		System.out.printf("Hello %s %s you have %s year’s old; nice to meet you!%n", userFirstName, userLasttName, userAge);
//		System.out.println("Hello " + userFirstName + " " + userLasttName + " you have " + userAge + " year’s old; nice to meet you!");
		
		double randonNum = Math.random();
		int randomInt = (int)(randonNum * 100)/2;
		int randomIntCorrected = randomInt + 1;		
		
		if (randomInt == 0) {
			System.out.printf("%d%n", randomIntCorrected);
		} else {
			System.out.printf("%d%n", randomInt);
		}
		
		System.out.println("Please guess a number between 1 and 50");
		int userNum = input.nextInt();
		
		if (userNum == randomInt || userNum == randomIntCorrected) {
			System.out.println("lucky " + userFirstName);  
		} else {
			if (userNum > randomInt) {
			System.out.println("Choose a smaller one, you were unlucky " + userFirstName); 
		} else {
			System.out.println("Choose a bigger one, you were unlucky " + userFirstName);
		}
		}
		

	}

}
