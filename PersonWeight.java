import java.util.Scanner;

public class PersonWeight {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double weightKg;
       
        System.out.println("Enter the weight in kilograms");
        weightKg = myScanner.nextDouble();

        System.out.printf("%.2f%s = %.2f%s", weightKg,"kg", weightKg*2, "lbs");

        myScanner.close();


    }
}
