package midterm_task4;

import java.util.Scanner;


public class Midterm_task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = input.next();
		
		int stringSize = word.length();
		System.out.println(stringSize);
		
		String first3 = word.substring(0, 3);
//		System.out.printf("%s%n", first3);
		

		if (stringSize < 3) {
			System.out.printf("%s%s%s %n", word, word, word);
		} else {
			System.out.printf("%s%s%s %n", first3, word, first3);
		}
				
	}

}
