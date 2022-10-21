// RollingDice.java

// write a program that rolls a pair of dice until the sum of numbers rolled
// is a specific number. return the number of times the dice are rolls to 
// get the desired sum.

/* Algorithm:
  ♦ the die 1 and die 2
  ♦ roll count 
  ♦ the sum of 2 dice 
  ♦ (int)Math.random() x 6 + 1
*/

public class RollingDice {
    public static void main(String[] args) {
        System.out.println("The number of times the dice are " 
        + " rolled to get the sum 10 = " + rollDice(10) );
    } // end method main

    // rollDice method declaration 
    public static int rollDice(int num) {
        // declare variables
        int die1, die2;
        int sum;        // sum of 2 dice value
        int rollCount;

        // initialize variables
        rollCount = 0;
       
       /* double value = (Math.random() * 6) + 1;
        System.out.println(Math.floor(value));
        System.out.println(Math.ceil(value));
        */
        do {          
            die1 = (int)(Math.random() * 6) + 1;
            die2 = (int)(Math.random() * 6) + 1;        
            sum = die1 + die2;
            rollCount++;
        } while ( sum != num);

        return rollCount;
    } // end method rollDice

} // end class RollingDice
