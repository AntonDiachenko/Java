
/*
 Write a method to accept an integer from the user, then calculate the 
 product of this array elements based on recursion method. The method must be called
 in a main method based on an array of double from 0 to 1 randomly generated.
e.g. for array [0.1 0.2 0.15 0.13], the product is 0.0039
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductsOfArrayItems {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		DecimalFormat df2 = new DecimalFormat("#.####");
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the number of products");
		int itemsNumber = myScanner.nextInt();
		double[] myArray = new double[itemsNumber];
		int arrLength = myArray.length;
		for (int i=0; i<arrLength; i++) {
			
			myArray[i] = Math.random();
			int itemNum = i+1;
			System.out.println("Array item " + itemNum + " is " + df.format(myArray[i]));
		}

		System.out.println("-------------------");
        double result = calcProduct(myArray, arrLength - 1);
//        System.out.println(result);
		System.out.println("The product is " + df2.format(result));
		
		myScanner.close();
	}
	
	public static double calcProduct(double arr[], int i) {
        if (i == 0) {
            return(arr[i]);        	
        }
        else {
         	return arr[i] * calcProduct(arr, i - 1);
        }

    }
	
	
	
}
