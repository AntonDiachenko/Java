package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int a = 0;
		friendsNames(a);

	}

	public static void friendsNames(int a) {
		String [] myArr = new String [4];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 4 names");
		int counter = 0;
		for (int i=0; i<myArr.length; i++) {
			String name = input.next();
			myArr [counter] = name;
			counter++;
		}
		System.out.printf("%s%n%s%n%s%n%s", myArr[0], myArr[1], myArr[2], myArr[3]);
	}
		
}
				
		

