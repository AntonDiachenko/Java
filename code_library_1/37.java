package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int [] numbers = new int [] {0,56,45,4,5};
		for (int element : before4(numbers)) {
			System.out.printf("%d %n", element);
		}
	}

	//Answer 10
	public static int[] before4(int[] arr) {
		int sizeCounter = 1;
		int[] tempArray = new int[sizeCounter];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 4) {
				break;
			}
			if (arr[i] != 4) {
				tempArray = new int[sizeCounter];
				for (int a = 0; a < sizeCounter; a++) {
					tempArray[a] = arr[a];
				}
				sizeCounter++;
			}
		}
		int[] newArray = new int[sizeCounter - 1];
		for (int a = 0; a < sizeCounter - 1; a++) {
			newArray[a] = tempArray[a];
		}
		return newArray;
	}
		
}
				
		

