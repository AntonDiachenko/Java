package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		String a = "asfxykkjxy12xylkxxy";
		System.out.println(plusOut(a));

	}

	//Answer 10
	public static String plusOut(String test) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = "0";
		String newstring = "";
		while (!(word = input.nextLine()).isEmpty()) {
			int testFirstLetter = 0;
			int testLastLetter = word.length();
			while (testLastLetter <= test.length()) {
				String chopped = test.substring(testFirstLetter, testLastLetter);
				if (chopped.equalsIgnoreCase(word)) {
					testFirstLetter = testFirstLetter + word.length();
					testLastLetter = testLastLetter + word.length();
					newstring = newstring.concat(chopped);
				} else {
					testFirstLetter = testFirstLetter + 1;
					testLastLetter = testLastLetter + 1;
					newstring = newstring.concat("+");
				}
			}
		}
		test = newstring;
		return test;
	}
		
}
				
		

