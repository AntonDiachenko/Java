package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int index = 2;
		int [] numbers = new int [] {0,2,1,3,4};
		for (int element : multiply(numbers, index)) {
			System.out.printf("%d %n", element);
		}
	}
	
	public static int[] multiply(int[] arr, int number) {
		int[] newArray = new int[arr.length];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			newArray[counter] = arr[i] * number;
			counter++;
		}
		return newArray;
	}	
}
				
		

