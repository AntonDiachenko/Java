
// Purpose: using printf() method

public class PrintFormatting {
    // main method 
    public static void main(String[] args) {
        // 1. Declaration Phase
        double dblValue;   
        int intValue;
        String strValue;
        int centimeters;
        // 2. Initialization Phase 
        dblValue = 12300.456789;
        intValue = 6789;
        strValue = "Java Programming II";
        centimeters= 10;
 
        // 3. Processing Phase 
 
        // 4. Termination (output) Phase
        System.out.printf("Total is: $%,.3f%n", dblValue);
        System.out.println();
        System.out.printf("Total is: %20.2f: ", dblValue);
        System.out.println();
        System.out.printf("%40d", intValue);
        System.out.println();
        System.out.printf("%200.8s\n", strValue);
        System.out.println();
        System.out.printf("%,20d %n %s %n %S %n", -123456789, "Welcome To", "java");
 
        // how many inches in centimeters 
        // Syntax: System.out.printf(formatString, argumentList);
        System.out.printf("there are %.2f inches in %d centimeters.%n", 
        centimeters / 2.54, centimeters);
     } // end method main
 
 } // end class PrintFormatting