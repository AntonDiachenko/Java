package midterm_task2;

import java.util.Scanner;

public class Midterm_task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an ASCII code between 0 and 127 (inclusive)");
		int userCode = input.nextInt();
		
		if (userCode < 0 || userCode > 127) {
			System.out.println("Error: the number must be between 0 and 127 (inclusive)");
			System.exit(1);
		} else
			System.out.printf("The character related to your number is %c", (char)userCode);

	}

}
