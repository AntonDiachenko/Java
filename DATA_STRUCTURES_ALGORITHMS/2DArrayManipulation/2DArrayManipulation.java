/*

  Create a Java program to let the user enter the number of rows and columns of a 2D array of int,
  then the user should be prompt to enter the elements of the 2D array. 
  Then the program should display the sorted 2D array column-wise as shown in picture below.
  Repeat the same procedure to sort the same 2D array row-wise.
  The input validation should be implemented to ensure that the array is only populated 
  with int elements.
 */

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rowNum = myScanner.nextInt();
		System.out.print("Enter number of columns: ");
		int colNum = myScanner.nextInt();
		
		int[][] nums = new int[rowNum][colNum];
				
		System.out.println("Enter Array Elements ");		
		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				nums[row][col] = myScanner.nextInt();
			}
		}
		sort(nums);
		
		System.out.println("Array after sorting is:  ");
		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				System.out.print(nums[row][col]+" ");
			}
			System.out.println(" ");
		}
		myScanner.close();
	}
	
	public static void sort(int arr[][]) {
		int i, j, temp;
		int n=arr.length;
		int m=arr[0].length;
		for (i = 0; i < n * m - 1; ++i) {
			for (j = 0; j < n * m - 1 - i; ++j) {
				if (arr[j / m][j % m] > arr[(j + 1) / m][(j + 1) % m]) {
					temp = arr[(j + 1) / m][(j + 1) % m];
					arr[(j + 1) / m][(j + 1) % m] = arr[j / m][j % m];
					arr[j / m][j % m] = temp;
				}
			}
		}
	}

}
