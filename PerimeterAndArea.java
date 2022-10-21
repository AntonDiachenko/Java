import java.util.Scanner;

public class PerimeterAndArea {
    static Scanner myScanner = new Scanner(System.in);


    public static void main(String[] args) {
        double perimeter;
        double area;
        
        System.out.println("Enter the length of the rectangle");
        double length = myScanner.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width = myScanner.nextDouble();

        perimeter = 2 * (length + width);
        area = length*width;

        System.out.printf("%s%.2f%n%s%.2f", "Perimeter is equal to ", perimeter, "Area is equal to ", area);

        myScanner.close();
    }
}
