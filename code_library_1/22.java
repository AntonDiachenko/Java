package test1;

public class Test1 {

	public static void main(String[] args) {
		
	// Return the highest number from the Array
		
		int [] myArr = new int [] {1,56,45,222,5,9,9,8};
		
		System.out.printf("the highest grade is %d %n", highest(myArr));

	}
	              //option 1
	public static int highest(int[] numbers) {
		if (numbers.length > 0) {
			int highestNum = numbers[0];
			for (int i : numbers) {
				if (i > highestNum) {
					highestNum = i;
				}
			} return highestNum;
			
		} return -1;
	}
	              //option 2
/*	public static int highest(int[] numbers) {
		if (numbers.length > 0) {
			int highestNum = numbers[0];
			for (int i=0; i<numbers.length; i++) {
				if (numbers [i] > highestNum) {
					highestNum = numbers [i];
				}
			}return highestNum;
		} return -1;
		 
	}*/

}
