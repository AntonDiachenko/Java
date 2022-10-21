import java.util.Scanner;


// prigram to thest the various methods of the class CLock



public class ClockTesterOne {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        // create two objects (instances) of the class CLock
        CLock myClock = new CLock(5, 4, 30);
        CLock yourClock = new CLock();


        // declare variables 
        int theHours;
        int theMinutes;
        int theSeconds;

        System.out.println("My clock is: " + myClock);
        // myClock.printTime();
        System.out.println();

 
        // change your clock
        yourClock.setTime(5, 4, 30);
        yourClock.printTime();
        System.out.println();

        // compare times
        if (myClock.equals(yourClock)) {
            System.out.println("Both times are equal");
        } else {
            System.out.println("Both times are not equal");
        }

        // prompt user for entering the time
        System.out.println("ENter the hours, minutes and seconds");

        theHours = console.nextInt();
        theMinutes = console.nextInt();
        theSeconds = console.nextInt();

        System.out.println();
        myClock.setTime(theHours, theMinutes, theSeconds);
        System.out.println("THe time entered by user is ");
        myClock.printTime();
        System.out.println();

        // increment by one second
        myClock.incrementSeconds();
        System.out.println("THe time after incremented by one second is ");
        myClock.printTime();
        System.out.println();

        // increment by one minute
        myClock.incrementMinutes();
        System.out.println("THe time after incremented by one minute is ");
        myClock.printTime();
        System.out.println();

        // test method makeCopy
        yourClock.makeCopy(myClock);
        System.out.println("Your time after copying my clock to yours is ");
        myClock.printTime();
        System.out.println();
        yourClock.printTime();
        System.out.println();

    } // end method main

} // end class ClockTesterOne
