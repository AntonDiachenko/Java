package test2;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 10 - 99");
		int num1 = input.nextInt();
		System.out.println("Enter another number between 10 - 99");
		int num2 = input.nextInt();
		System.out.println(hasSharedDigit(num1, num2));

	}

	public static boolean hasSharedDigit(int a, int b) {
		if (!(a >= 10 && a <= 99) && (b >= 10 && b <= 99))
			return false;

		int num1 = a;

		while (num1 > 0) {
			int digit1 = num1 % 10;
			int num2 = b;
			while (num2 > 0) {
				int digit2 = num2 % 10;
				if (digit1 == digit2)
					return true;
				num2 /= 10;
			}
			num1 /= 10;
		}
		return false;
	}
}
