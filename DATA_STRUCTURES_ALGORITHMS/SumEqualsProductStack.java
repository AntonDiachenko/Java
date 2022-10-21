/*
 Write a method that takes a Stack of Integer as parameter and return true if the sum of the elements 
 equals the product of elements in the Stack and false otherwise.
 */

import java.util.Stack;

public class StacksAndQueues {

	public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.add(2);
        myStack.add(2);

        int sum = 0;
        int product = 1;
        
        for (Integer myInt : myStack) {
            sum = sum + myInt;
            product = product * myInt;
        }
        
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println(checkSumAndProd(sum, product));
    }

    public static boolean checkSumAndProd(Integer sum, Integer product) {
        boolean check = false;
        if (sum == product) {
            check = true;
            return check;
        } else {
            return check;
        }
    }

}
