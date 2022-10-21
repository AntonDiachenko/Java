/* Purpose:
Consider the following problem statement:
A person invests $1000.00 in a savings account 
yielding 5 percent interest. Assuming that all 
interest is left on deposit in the account, 
calculate and print the amount of money in the 
account at the end of each year for 10 years. 
Use the following formula for determining 
these amounts:

	a = p (1 + r)^n

Where
	p is the original amount invested (i.e., the principal)
	r is the annual rate,
	n is the number of years, and
	a is the amount on deposit at the end of the nth year 
*/

public class InterestOne {
    public static void main(String[] args) {
        double startAmount = 10000.00;
        double annualRate = 0.05;
 
        for (int i=1; i<=10; i++) {
            System.out.printf("The sum in the end of Year %s is $" +
            "%.2f %n", i, startAmount * Math.pow((1+annualRate), i));
        }



    } // end of main
}
