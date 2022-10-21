package com.jac.example;

import java.util.Scanner;

//CTRL + SHIFT + O => Auto import

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// IF

		int x = 12;

		if (x == 12) {
			System.out.println("the value of x = 12");
		}

		// AND &&
		// open the fridge if you have eggs and if you have tomato
		// the make an omlet
		System.out.println("please enter the age");

		int age = input.nextInt();
		if (age > 18 && age < 60) {
			System.out.println("you are allowed to enter ");
		} else {
			System.out.println("you are not allowed to enter ");
		}

		// if you have either eggs or tomato
//		int score = 60;
//		int homeworkGrade = 10;
//		

		// OR operator ||
		System.out.println("please enter your grade");
		int score = input.nextInt();

		System.out.println("please enter your homework grade");
		int homeworkGrade = input.nextInt();

		if (score > 70 || homeworkGrade > 9) {
			System.out.println("you are passed");
		} else {
			System.out.println("you are failed !");
		}
		// CTRL + / => comment and uncomment

		// NOT operator => !

		int a = 12;
		int b = 10;
		if (!(a > b)) { // => if (a <=b)
			System.out.println("a is less than equal b");
		}

		boolean check = false;
		if (!check) { // if (check == true)
			System.out.println("check is true");
		}

		boolean flag = true;
		if (!flag) { // flag == false
			System.out.println("flag is false");
		}
		if (flag) { // flag == true
			System.out.println("flag is true");
			
			//nested if
			if (check) {
				//do something
			}
		}
		
		
		
	}

}
