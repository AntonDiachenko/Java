public class Factorial {
    public static void main(String[] args) {
        System.out.println("The factorial of 10 = " + fact(10) );
    } // end method main

    public static int fact(int number) {
        // base case condittion 0! = 1
        if (number == 0) {
            return 1;
        } else { 
            // general case n1 = n x (n - 1)!
            return number * fact(number - 1) ;
        }
    } // end method fact
    
} // end class Factorial
