package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int a = 0;
		totalAverage(a);

	}

	public static void totalAverage(int a) {
		int counterPositive = 0;
		int sumPositive = 0;
		int sumNegative = 0;
		int counterNegative = 0;
		int userNum = 1;
		System.out.println("Enter numbers. When you finish enter 0");
		while (userNum != 0) {
			Scanner input = new Scanner(System.in);
			
			userNum = input.nextInt();
				if (userNum>0) {
					counterPositive++;
					sumPositive = userNum+sumPositive;
				} if (userNum<0) {
					counterNegative++;
					sumNegative = userNum+sumNegative;
				}
		} if (counterNegative==0) {
			counterNegative=counterNegative+1;
		}
		if (counterPositive==0) {
			counterPositive=counterNegative+1;
		}
		System.out.printf("Sum of positive numbers = %d , average = %d %n", sumPositive, sumPositive/counterPositive);
		System.out.printf("Sum of negative numbers = %d , average = %d %n", sumNegative, sumNegative/counterNegative);
	}
		
}
				
		

