/*
 Write a recursive method to determine the LCM (least common multiple) of two given numbers.
e.g. method(8, 12) should return 24.
 */
import java.util.Scanner;

public class LeastCommonMultiple {
	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in);
 		System.out.println("Enter first number");
        int firstNum=myScanner.nextInt(); 		
        System.out.println("Enter second number"); 
        int secondNum=myScanner.nextInt();  
        
 		int lcm = getLCM(firstNum, secondNum, 1);
        System.out.println("LCM = " + lcm);
        
	}
	
	  public static int getLCM(int a, int b, int c) {
		  if(c % a ==0 && c % b ==0) {
			return c;
	      } else {
	           return getLCM(a, b, c+1);
	        }
	  }
	  
}
