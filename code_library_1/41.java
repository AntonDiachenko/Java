package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int index = 30;
		printFactors(index);
		
	}
	
	public static void printFactors(int number) {
		int factor = 1;
		if (number < 1) {
			System.out.println("Invalid Value");
		} else {
			while (factor > 0) {
				if (number % factor != 0) {
					factor++;
				} else {
					System.out.printf("%d ", factor);
					factor++;
				}
			}
		}
	}	
}
				
		

