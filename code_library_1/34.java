package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int a = 0;
		longestName(a);

	}

	public static void longestName(int a) {
		Scanner input = new Scanner(System.in);
		String longestName = "0";
		int lengthSum = 0;
		System.out.println("Please enter names");
		String name;
		while (!(name = input.nextLine()).isEmpty()) {
				lengthSum = name.length() + lengthSum;
			if (name.length() > longestName.length()) {
				longestName = name;
			} 
		} System.out.printf("Longest name is %s%nLength of all names is %d%n", longestName, lengthSum);
	}
		
}
				
		

