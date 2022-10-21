package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// xy*yyz should return true
		// xy*zxy should return false
		char x = '*';
		System.out.println(sameStarChar(x));

	}

	//Answer 10
	public static boolean sameStarChar(char a) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter characters");
		String userString = input.next();
		int counter = 0;
		for (int i = 0; i < (userString.length() - 1); i++) {
			counter++;
			if (userString.charAt(counter) == (a)
					&& (userString.charAt(counter - 1) == userString.charAt(counter + 1))) {
				return true;
			}
		}
		return false;
	}
		
}
				
		

