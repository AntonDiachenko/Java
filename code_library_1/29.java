package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int a = 0;
		patterns(a);

	}

	public static void patterns(int a) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of lines");
		int index = input.nextInt();
		System.out.println("Pattern A");
		for (int row=0; row<index; row++) {
			for (int num=1; num<=row+1; num++) {
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
		
		System.out.println("-------");
		System.out.println("Pattern B");
		for (int line=0; line<index; line++) {
			for (int column=1; column<=index-line; column++) {
				System.out.printf("%d ", column);
			}
			System.out.println();
		}
		
		System.out.println("-------");
		System.out.println("Pattern C");
		for (int x=0; x<index; x++) {
			for (int y=2; y<(index-x)*2; y++) {
				System.out.print(" ");
			}
			for (int k=1; k<=x+1; k++) {
				System.out.printf("%d ", k);
			}
			System.out.println();
		}
		
		System.out.println("-------");
		System.out.println("Pattern D");
		for (int e=0; e<index; e++) {
			for (int f=1; f<=e; f++) {
				System.out.print("__");
			}
			for (int f=1; f<=index-e; f++) {
				System.out.printf("%d ", f);
			}
			System.out.println();
		}
		
		System.out.println("-------");
		System.out.println("Pattern E");
		for (int row=1; row<=index; row++) {
			for (int space=row; space<index; space++) 
				System.out.print(" ");
			for (int star=1; star<(row*2); star++) 
				System.out.print("*");
			System.out.println();
		}
		System.out.println("-------");
		System.out.println("Pattern F");		
		for (int i=1; i<=index; i++) {
			double x = Math.pow(i, i);
			int result = (int)x;
			System.out.printf("%d %d %d %n", i, i, result);
		}
		
		//pattern with random number 0 or 1;
		System.out.println("-------");
		System.out.println("Pattern G");		
		for (int row=0; row<index; row++) {
			for (int column=0; column<index; column++) {
				double random = Math.random();
				int x = (int) Math.round(random);	
				System.out.printf("%d", x);
			}
			System.out.println();
		}
	}
		
}
				
		

