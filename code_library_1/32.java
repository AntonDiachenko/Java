package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int[] a = new int[] {3,6,1,9,15,4};
		System.out.println(sumHighLow(a));

	}

	public static int sumHighLow(int[] numbers) {
		if (numbers.length > 0) {
			int highestNum = numbers[0];
			int lowestNum = numbers[0];
			for (int i=0; i<numbers.length; i++) {
				if (numbers [i] > highestNum) {
					highestNum = numbers [i];
				}
				if (numbers [i] < lowestNum) {
					lowestNum = numbers [i];
				}
			}return highestNum+lowestNum;
		} return -1;
	}
		
}
				
		

