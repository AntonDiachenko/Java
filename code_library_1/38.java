package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int [] numbers = new int [] {0,56,45,4,5};
		System.out.println(bigDiff(numbers));
	}

	//Answer 10
	public static int bigDiff(int[] numbers) {
		int smallestNum = numbers[0];
		int highestNum = numbers[0];
		int diff = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallestNum) {
				smallestNum = numbers[i];
			}
		}
		for (int h : numbers) {
			if (h > highestNum) {
				highestNum = h;
			}
		}
		diff = highestNum - smallestNum;
		return diff;
	}
		
}
				
		

