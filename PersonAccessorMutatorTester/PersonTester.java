import java.util.Scanner;

public class PersonTester {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Person firstPerson = new Person("", 0, 0);
        Person changedPerson = new Person();
        
        String newName;
        int newAge;
        double newHeight;

        System.out.print("Enter the name: ");
        newName = myScanner.next();
        System.out.println();
 
        System.out.print("Enter the age: ");
        newAge = myScanner.nextInt();
        System.out.println();
        

        System.out.print("Enter the height: ");
        newHeight = myScanner.nextDouble();
        System.out.println();
   

        firstPerson.setName(newName);
        firstPerson.setAge(newAge);
        firstPerson.setHeight(newHeight);

        System.out.println(firstPerson);
        firstPerson.allowedToEnter();

        changedPerson.setName("Peter");
        changedPerson.setAge(16);

        System.out.println("The person is now called " + changedPerson.getName() + " and is " + changedPerson.getAge() + " old.");
        changedPerson.allowedToEnter();

        
        

        



        
    } // end method main
}
