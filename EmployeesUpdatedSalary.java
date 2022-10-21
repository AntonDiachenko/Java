/*

 Three employees in a company are up for a special pay increase. You are
given a file, say EmployeesSalary.txt, with the following data:

Miller Andrew 65789.87 5
Green Sheila 75892.56 6
Sethi Amit 74900.50 6.1

Each input line consists of an employee's last name, first name, current salary,
and percent pay increase. For example, in the first input line, the last name of
the employee is Miller, the first name is Andrew, the current salary is
65789.87, and the pay increase is 5%. Write a program that reads data from
the specified file and stores the output in the file EmployeesUpdatedSalary.txt.  
For each employee, the data must be output in the following form: firstName
lastName updatedSalary. Format the output of decimal numbers to two
decimal places.
Save the file as EmployeesUpdatedSalary.java.  
 
 */

import java.util.*;
import java.io.*;

public class EmployeesUpdatedSalary {
    public static void main(String[] args) throws FileNotFoundException{
        String firstName, lastName;
        double currentSalary;
        double percentIncrease;
        double updatedSalary;

        Scanner inFile = new Scanner(new FileReader("C:\\PC\\Antonio\\02 Montreal\\JohnAbbott\\courses\\420-JB4-AB PROGRAMMING II\\Java_II_Labs\\Java_II_Labs_03\\In_Class_Activities_Class_3\\EmployeesSalary.txt"));
        PrintWriter outFile = new PrintWriter("C:\\PC\\Antonio\\02 Montreal\\JohnAbbott\\courses\\420-JB4-AB PROGRAMMING II\\Java_II_Labs\\Java_II_Labs_03\\In_Class_Activities_Class_3\\EmployeesUpdatedSalary.txt");

        /*lastName = inFile.next();
        firstName = inFile.next();
        currentSalary = inFile.nextDouble();
        percentIncrease = inFile.nextDouble();

        updatedSalary = currentSalary * (percentIncrease/100);*/

        // outFile.printf("%s %s %.2f", firstName, lastName, updatedSalary);
        for (int i=1; i<=3; i++) {
            lastName = inFile.next();
            firstName = inFile.next();
            currentSalary = inFile.nextDouble();
            percentIncrease = inFile.nextDouble();
            updatedSalary = currentSalary * (1+(percentIncrease/100));

            outFile.printf("%s %s %.2f %n", firstName, lastName, updatedSalary);
        }
        
        inFile.close();
        outFile.close();
    }
}
