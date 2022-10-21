package test;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
			
	
		Random r = new Random();
		int low = 10;
        int high = 20;
        int randomNum = r.nextInt(high-low) + low;
        System.out.println(randomNum);	
	
		
	} 
	
}
