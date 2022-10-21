/*
 Write a method that finds the maximum of an array based on recursion.
 */

public class ArrayMaxNumber {
	public static void main(String[] args) {
		

	int[] myArray = {1, 14, 5, 6, 3, 33, 4, 8, 22};
	System.out.println(findMaxNum(myArray));
}	
	
	
    public static int findMaxNum(int[] arr) {
    	
    	if (arr == null) {
            return -1;    		
    	}
    	
    	if (arr.length == 0) {
            return arr[0];    		
    	}
    	
    	if (arr.length == 1) {
            return arr[0];    		
    	} 
    	
    	int[] temp = new int[arr.length -1];
    	System.arraycopy(arr, 0, temp, 0, temp.length);

        return Math.max(arr[arr.length-1], findMaxNum(temp));
        	
    }
    

}
