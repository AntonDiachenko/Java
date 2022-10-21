/*
 The population of a town A is less than the population of town B.
However, the population of town A is growing faster than the population
of town B. Write a program that prompts the user to enter the population
and growth rate of each town. The program outputs after how many years
the population of town A will be greater than or equal to the population of
town B and the populations of both the towns at that time. (A sample input
is: Population of town A = 5,000, growth rate of town A = 4%, population
of town B = 8,000, and growth rate of town B = 2%.). Create a method, 
getPopulations() that calculates and returns the number of years that takes 
the population of town A to be greater than or equal to the population of 
town B. 
Sample run:
----------
Enter the current population of town A: 5000

Enter the current population of town B: 8000

Enter the growth rate of town A: 4

Enter the growth rate of town B: 2

After 25 year(s) the population of town A will be greater than or equal 
to the population of town B.
After 25 population of town A is 13308
After 25 population of town B is 13110
 */

import java.util.Scanner;

public class ICA_4_3 {
    public static void main(String[] args) {
        int populationTownA, populationTownB;
        double growthRateA, growthRateB;
       

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the current population of town A");
        populationTownA = myScanner.nextInt();
        System.out.println("Enter the current population of town B");
        populationTownB = myScanner.nextInt();
        System.out.println("Enter population growth rate for town A");
        growthRateA = myScanner.nextDouble();
        System.out.println("Enter population growth rate for town B");
        growthRateB = myScanner.nextDouble();

        getPopulations(populationTownA, growthRateA, populationTownB, growthRateB);
    
        myScanner.close();

    }

    public static double getPopulations(int num1, double rate1, int num2, double rate2) {
        int numberYears = 0;

        while (num1 <= num2){
            num1 = (int)(num1 * (1+(rate1/100)));
            num2 = (int)(num2 * (1+(rate2/100)));
            numberYears++;
        }
        System.out.printf("After %s year(s) the population of town A will be greater than " +
        "or equal to the population of town B. %n", numberYears);
        System.out.printf("After %s population of town A is %s %n" +
        "After %s population of town B is %s %n", numberYears, num1, numberYears, num2);

        return numberYears;
    } 

}
