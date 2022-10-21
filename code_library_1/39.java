package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		String newWord = "fdsgoodd1Badgsdgsbaddfgoods";	
		boolean test = goodBad(newWord);
		if (test) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static Boolean goodBad(String word) {
		int firstLetter1 = 0;
		int lastLetter1 = 4;
		int firstLetter2 = 0;
		int lastLetter2 = 3;
		int counterWord1 = 0;
		int counterWord2 = 0;

		while (lastLetter1 <= word.length()) {
			String choppedString1 = word.substring(firstLetter1, lastLetter1);
			firstLetter1 = firstLetter1 + 1;
			lastLetter1 = lastLetter1 + 1;
			if (choppedString1.equalsIgnoreCase("good"))
				counterWord1++;
		}

		while (lastLetter2 <= word.length()) {
			String choppedString2 = word.substring(firstLetter2, lastLetter2);
			firstLetter2 = firstLetter2 + 1;
			lastLetter2 = lastLetter2 + 1;
			if (choppedString2.equalsIgnoreCase("bad"))
				counterWord2++;
		}
		
		if (counterWord1 == counterWord2) {
			return true;
		} else {
			return false;
		}
	}	
}
				
		

