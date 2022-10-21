//package name
package examples;

//imports are here


/**
 * @ : Jan 28
 * @author reza.shalchian
 *
 */

//class definition
public class Day1examples { //class starts here

	
	//main method starts here
	public static void main(String[] args) {
		//main code starts here
		
		//variable definition
		int a = 12 / 2;
		
		String familyName = "sha"; //camelcase
		int my_1variable = 12;//Underscore is accepted 
		int myage1 = 20; //Digits are accepted
		int myage$_ = 30; //$ is accepted
		
		//int emp salary = 2000; -> illegal
		
		//conventions
		//CamelCase
		
		//int return = 2; we can not use keywords for variables
		
		System.out.println("this is the first program" + " today");
		
		
		//Testing the default value
		//boolean variable; since we are in the main method it asks us to initialize it
//		boolean variable;
//		System.out.println("max integer" + variable);
		
		//check the size of variables
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		int myValue = 2147483647;
		char ch = 'a';
		
		boolean flag = false;
		//checking if the person is adult
		//age >= 18 -> flag = true;
		if (flag) {
			System.out.println("flag is true");
		}
		
		System.out.println("max integer" + maxInt);
		System.out.println("min integer" + minInt);

		
		//Arithmetic operator
		// / and % => 5 % 2 = 1 and 5 / 2 = 2
		// 12 / 3 = 4 and 12 %  3 = 0
		float result = (float)5 / 2;
		System.out.println(result);
		
		
		//Precedence
		// a + b * d / e => 1 + 2 * 7 / 6 = 3
		int resultOfPrecedence = 1 + ((2 * 7) / 6);
		System.out.println(resultOfPrecedence);
				
		boolean dividable = false;
		if (13 % 3 == 0) {
			dividable = true;
		}
//		else {
//			dividable = false;
//		}
		//if (dividable)
		if (dividable == true) {
			
			System.out.println("those numbers are dividable");
		}
		else {
			System.out.println("those numbers are not dividable");
		}
		
		double x = 12 + 3.5;
		double y = 6 /4  + 3.9;
		
		System.out.println(x + " " + y);
		
		
	}//main method ends here

}//class ends here
