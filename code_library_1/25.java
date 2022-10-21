package com.jac.day9;

public class Practice {
	public static void main(String[] args) {
		// remove duplicates
		// without sorting
//		int[] arr = new int[] { 1, 3, 3, 1, 4, -2, 1 };
		int[] arr = new int[] { 1, 3, 3, 1, 0, 0, 1 };

		for (int i : noDuplicates(arr)) {
			System.out.printf("%d ", i);
		}
	}

	public static int[] noDuplicates(int[] numbers) {
		// take each element from the main array
		// create a temp array
		// put elements in the array if it is not there

		int[] tempArray = new int[numbers.length];
		int tempCounter = 0;
		for (int i = 0; i < numbers.length; i++) {
			int element = numbers[i];
			boolean exist = false;
			for (int j = i + 1; j < numbers.length; j++) {
				if (element == numbers[j]) {
					exist = true;
					break;
				}
			}
//			for (int j = 0; j < numbers.length; j++) {
//				if (element == tempArray[j]) {
//					exist = true;
//					break;
//				}
//			}
			
			if (!exist) {
				tempArray[tempCounter++] = element;
			}
		}

		int[] result = new int[tempCounter];

		for (int i = 0; i < tempCounter; i++) {
			result[i] = tempArray[i];
		}

		return result;
	}
}
