package com.jac.answer;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		//exc1
		
		//ask the user to enter the number of lines
		// you have 6 * each line
		// ******
		// ******
		// ******
		// ..
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter how many lines ? ");
		int line = input.nextInt();
		for (int row = 0; row< line ; row++) {
			//System.out.printf("%s", "******");
			for(int column = 0 ; column<6; column++) {
				System.out.printf("%c   ", '*');
			}
			System.out.println();
		}
		
		//exc2
		for (int row=0; row<6 ; row++) {
			for(int num=1; num<row+1;num++) {
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		
	

	}

}
