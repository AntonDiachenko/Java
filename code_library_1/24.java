package com.jac.practice;

import java.util.Arrays;

public class Answers {

	public static void main(String[] args) {
		int[] numbers1 = new int[] {10, 20 , 30, 40, 50};
		
		int[] result1 = reverse(numbers1);
		for (int i : result1) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		int[] numbers2 = new int[] {10, 20 , 30};
		int[] result2 = reverse(numbers2);
		for (int i : result2) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		int[] arr = new int[8];
		for (int i : arr) {
			System.out.printf("%d " , i);
		}
		System.out.println();
		boolean[] arrBoolean = new boolean[8];
		for (boolean  b : arrBoolean) {
			System.out.printf("%b " , b);
		}
		System.out.println();
		
		String[] arrString = new String[8];
		for (String s : arrString) {
			System.out.printf("%s " , s);
		}
		System.out.println();
		
	
	}
	
	//METHOD
	public static int[] reverse(int[] nums) {
		
		//you need a helper array
		//you need to define a new array
		int[] result = new int[nums.length];
		
//		for (int i : result) {
//			//it starts from first(0) index
//		}
		
		//iterate from right to left
		int counter = 0;
		for(int i = nums.length - 1 ; i>=0; i--) {
			result[counter++] = nums[i];
		}
		
		return result;
		
		
	}
	

}
