/* Purpose:
prompt the user to enter the principal amount, number of years, and annual rate.
Assuming that all 
interest is left on deposit in the account, 
calculate and print the amount of money in the 
account at the end of each year. 
Use the following formula for determining 
these amounts:

	a = p (1 + r)^n

Where
	p is the original amount invested (i.e., the principal)
	r is the annual rate,
	n is the number of years, and
	a is the amount on deposit at the end of the nth year 
*/

import java.util.Scanner;

public class InterestTwo {
    public static void main(String[] args) {
 
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the start amount");
        double startAmount = myScanner.nextDouble();

        System.out.println("Please enter number of years");
        int numberOfYears = myScanner.nextInt();

        System.out.println("Please enter annual rate in percents");
        double annualRate = myScanner.nextDouble();
 
        for (int i=1; i<=numberOfYears; i++) {
            System.out.printf("Your sum in the end of Year %s is $" +
            "%.2f %n", i, startAmount * Math.pow((1+(annualRate/100)), i));
        }

        myScanner.close();
    }
}
