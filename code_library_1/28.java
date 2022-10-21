package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int x = 1;
		int[] test = new int[] { 1, 2, 1, 3, 1, 2, 3 };
		System.out.println(isEverywhere(test, x));

	}

	public static boolean isEverywhere(int[] arr, int a) {
		for (int i = 0; i <=arr.length-2; i++) {
			if (arr[i] != a && arr[i+1] != a) {
				return false;
			}
		}
		return true;
	} 
		
}
				
		

