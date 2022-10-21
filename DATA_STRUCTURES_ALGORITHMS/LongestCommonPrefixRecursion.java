/*
 Design a class that contains a recursive method to find the longest common prefix between 
 two given strings. For example:
Input1: technique, technician. Output1: LCP is techn
Input2: techie, technical. Output2: LCP is tech
In the main method of the same class, make an array of 2 Strings, 
and let the user enter them distinctly. 
Then call the longest common prefix (LCP) method to return the LCP of these 
2 Strings stored in an array.
 */

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] words = new String[2];
		Scanner myScanner = new Scanner(System.in);
 		System.out.println("Enter first word");
        words[0] = myScanner.next(); 	
 		System.out.println("Enter second word");
        words[1] = myScanner.next(); 
        
        System.out.println(lcp(words));
        
        	myScanner.close();	
	}
	
	public static String lcp (String[] arr) {
        String result = getLcp(arr, "");
        return result;
    }
	
    public static String getLcp(String[] string, String s) {
        if(string.length == 0) {
            return s;
        }
        for(int i=0; i<string.length; i++) {
            if(string[i].equals("")) {
                return s;
            }
        }
        String myChar = string[0].substring(0, 1);
        for(int i=0;i<string.length;i++) {
            if(!string[i].substring(0, 1).equals(myChar)) {
                return s;
            }
            else if(string[i].length()>1)
            	string[i] = string[i].substring(1, string[i].length());
            else
            	string[i]="";
        }
        return getLcp(string, s+myChar);
    }

    public static void display(String[] s) {
        for(int i=0; i<s.length; i++) {
            System.out.print(s[i]+" ");
        }
	}

}
