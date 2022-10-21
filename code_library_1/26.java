package exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numbers[] = new int [4];
		
		for(int i = 0; i< numbers.length ; i++) {
			System.out.println("please enter a number");
			int number = input.nextInt();
			numbers[i] = number; 
		}
		for (int number : numbers) {
			System.out.printf("%d %n", number);
		}
		System.out.printf("smallest number is %d %n", smallest(numbers));
		System.out.printf("sum = %d %n", sum(numbers));
		System.out.printf("average = %d %n", average(numbers));
		System.out.printf("sum of odd = %d %n", sumOfOdd(numbers));
	
		
		
	}
	public static int smallest (int[]numbers) {
			int smallestNum = numbers[0];
			for (int i=0; i<numbers.length; i++) {
					if (numbers [i] < smallestNum) {
					smallestNum = numbers [i];
				}
			}return smallestNum;
	}
	public static int sum (int[]numbers) {
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
				sum = sum+numbers[i];
		} return sum;
	}
	public static int average (int[]numbers) {
		int sum = 0;
		int counter = 0;
		for (int i=0; i<numbers.length; i++) {
				sum = sum+numbers[i];
				counter++;
		} return sum/counter;
	}
	public static int sumOfOdd (int[]numbers) {
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]%2!=0) {
				sum=sum+numbers[i];
			}
		} return sum;
	}
}
