package com.jac.example;

public class RandomExample {
	public static void main(String[] args) {
		//RANDOM and how generate a random number
		
		double random = Math.random();
		System.out.println("the random number " + random);
		
		// generate a number between 0 - 100
		int randomLessThan100  = (int)(random * 100);
		System.out.println("the random number between 0 and 100 " 
		+ randomLessThan100);
		
		// increment and decrement
		// counter
		
		int counter = 0;
		//increment
		counter = counter + 1; // it is ok
		counter +=1; // it is good
		counter++; //it is cooool and nice for LOOPS
		
		//decrement
		counter = counter - 1;
		counter -= 1;
		counter --;
		
		//Challenge
		// generate a random number between 0 - 20
		// ask the user to enter a number
		// use SWITCH-CASE to check if the user could guess the number
		
		// if the user chooses a number less than 0 or more than 20
		// give a message to the user that he/she chose the wrong input
		
		// imagine the user never enters a string(character)
	
		
		
	}
}
