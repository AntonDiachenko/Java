/*
 Write a program that calculates and prints the monthly paycheck for an
employee. The net pay is calculated after taking the following deductions:

	Federal Income Tax: 		15%
	State Tax: 						3.5%
	Social Security Tax: 		5.75%
	Medicare/Medicaid Tax: 	2.75%
	Pension Plan: 					5%
	Health Insurance: 			$75.00

Your program should prompt the user to input the gross amount and the
employee name. The output will be stored in a file (MonthlyPaycheck.txt). 
Format your output to have two decimal places. A sample output follows:

Bill Robinson
Gross Amount: 				$ 3575.00
Federal Tax: 				$ 536.25
State Tax: 					$ 125.13
Social Security Tax: 	$ 205.56
Medicare/Medicaid Tax:	$ 98.31
Pension Plan: 				$ 178.75
Health Insurance: 		$ 75.00
Net Pay: 					$ 2356.00
 */

import java.util.Scanner;
import java.io.*;

public class MonthlyPaycheck {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner myScanner = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter("C:\\PC\\Antonio\\02 Montreal\\JohnAbbott\\courses\\420-JB4-AB PROGRAMMING II\\Java_II_Labs\\Java_II_Labs_03\\In_Class_Activities_Class_3\\MonthlyPaycheck.txt");

        System.out.println("Enter your gross amount");
        double grossAmount = myScanner.nextDouble();
        System.out.println("Enter your first name");
        String employeeFirstName = myScanner.next();
        System.out.println("Enter your last name");
        String employeeLastName = myScanner.next();

        outFile.printf("%s" + " %s%n" + 
        "Gross Amount: \t\t $ %.2f%n" +
        "Federal Tax: \t\t $ %.2f%n" +
        "State Tax: \t\t $ %.2f%n" +
        "Social Security Tax: \t $ %.2f%n" +
        "Medicare/Medicaid Tax: \t $ %.2f%n" +
        "Pension Plan: \t\t $ %.2f%n" +
        "Health Insurance: \t $ 75.00 %n" +
        "Net Pay: \t\t $ %.2f%n", 
        employeeFirstName, employeeLastName,
        grossAmount,
        grossAmount*0.15, 
        grossAmount*0.035, 
        grossAmount*0.0575, 
        grossAmount*0.0275,
        grossAmount*0.05,
        grossAmount-(grossAmount*0.32)-75);

        myScanner.close();
        outFile.close();
    }
}
