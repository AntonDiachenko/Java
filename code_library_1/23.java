package test;

import java.util.Scanner;

//import java.util.Random;
//import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
			
		int [] numbers = new int [] {87,56,45,222,5};
		
		for (int element : testArray(numbers)) {
			System.out.printf("%d %n", element);
		}
		
	}
		public static int[] testArray (int [] nums) {
			int[] reversedArray = new int[nums.length];
			int counter = 0;
			for (int i = nums.length -1; i>=0; i--) {
				reversedArray[counter++] = nums[i];
			}
			return reversedArray;
		}
			
}
