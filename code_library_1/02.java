package assignment2_bmi;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment2_bmi {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat ("0.00");
		DecimalFormat df1 = new DecimalFormat ("0.0");
		
		System.out.println("Enter your weight in pounds");
		float weightLb = input.nextFloat();
		double weightKg = weightLb * 0.45359237;
		
		
		System.out.println("Enter your height in inches");
		float heightIn = input.nextFloat();
		double heightM = heightIn * 0.0254;
		
		double bmi = weightKg / Math.pow(heightM, 2);
		
		System.out.println("Your weight is " + df2.format(weightKg) + "kg. Your height is " + df2.format(heightM) + "m");
		System.out.println("Your BMI is " + df2.format(bmi));
		
		if (bmi >=18.5 && bmi<=24.9) {
			System.out.println("Your weight is normal");
		} else {
			if (bmi <18.5) {
				System.out.println("You have underweight");
			} else {
				if (bmi >=25.0 && bmi<=29.9) {
					System.out.println("You have overweight");
				} else {
				System.out.println("You have obesity");				
			} 
			}
			
		}
	} 

}
