/* Purpose: define the class Clock to represent the time of day in a
program. Further suppose that the time is represented as a set of 
three integers: one to represent the hours, one to represent the 
minutes, and one to represent the seconds.
We want to perform the following operations on the time:
1. Set the time.
2. Return the hours.
3. Return the minutes.
4. Return the seconds.
5. Print the time.
6. Increment the time by one hour.
7. Increment the time by one minute.
8. Increment the time by one second.
9. Compare the two times for equality.
10. Copy the time.
11. Return a copy of the time.
*/


public class CLock {
    // DATA MEMBERS FROM THE CLASS CLOCK
    private int hr;
    private int min;
    private int sec;

// default constructor
// postcondition:hr = 0, min = 0, sec = 0
public CLock() {
    setTime(0,0,0);
  } // end default constructor

  // constructor with parameters to set the time
  // the time is set according to the parameter
  // postcondition: hr = hours, min = minutes, sec = seconds
   public CLock(int hours, int minutes, int seconds) {
       setTime(hours, minutes, seconds);
  } // end constructor with parameters

  // method to set the time
  // the time is set according to the parameters
  // Postcondition: hr = hours, min = min, sec = seconds
  public void setTime(int hours, int minutes, int seconds) {
    // hours  
    if (0<=hours && hours <24) {
        this.hr = hours;
      } else {
          this.hr = 0;
      }
      // minutes 
      if (0<=minutes && minutes <60) {
        this.min = minutes;
    } else {
        this.min = 0;
    }
    // seconds
    if (0<=seconds && seconds <60) {
        this.sec = seconds;
    } else {
        this.sec = 0;
    } 
  } // end method setTime

  // create the accessor (getter) methods
  // postcondition: the value of the hr is returned
  public int getHours() {
      return this.hr;
  } // end method getHours

    // postcondition: the value of the min is returned
    public int getMinutes() {
        return this.min;
    } // end method getMinutes

    // postcondition: the value of the min is returned
    public int getSeconds() {
        return this.sec;
    } // end method getSeconds

    // method to print the time 
    // postcondition: time is printed in the format of hh:mm:ss
    // adding leading zero before values less than 10
    public void printTime() {
        if (this.hr < 10) {
            System.out.print("0");
        }
        System.out.print(this.hr + ":");

        if (this.min < 10) {
            System.out.print("0");
        }
        System.out.print(this.min + ":");

        if (this.sec < 10) {
            System.out.print("0");
        }
        System.out.print(this.sec);
    } // end method printTime

// method to increment the time by one second
// postcondtion: the time is incremented by one second
// if the before increment time is 23:59:59, the time 
// is reset to 00:00:00
public void incrementSeconds() {
    this.sec++;
    if(this.sec > 59) {
        this.sec = 0; // reset seconds to zero
        // call incrementMinutes()
        incrementMinutes(); // increment minutes
    }
} // end method incrementSeconds

// method to increment the time by one minute
// postcondtion: the time is incremented by one minute
// if the before increment time is 23:59:53, the time 
// is reset to 00:00:53
public void incrementMinutes() {
    this.min++;
    if(this.min > 59) {
        this.min = 0; // reset minutes to zero
        // call incrementHours()
        incrementHours(); // increment hours
    }
} // // end method incrementMinutes

// method to increment the time by one hour
// postcondtion: the time is incremented by one hour
// if the before increment time is 23:59:53, the time 
// is reset to 00:00:00
public void incrementHours() {
    this.hr++;
    if (this.hr > 23) {
        this.hr = 0; // reset hours to zero
    }
} // end method incrementHours

// method to compare two clocks
// postcondition: return true if the time is equal to otherClock
// otherwise returns false
public boolean equals(CLock otherClock) {
    return (
           this.hr == otherClock.hr
        && this.min == otherClock.min
        && this.sec == otherClock.sec
    );
} // end method equals

// method makeCopy the time
// postcondition: the instance of the otherClock are copied into 
// the corresponding data members of the time
// this.hr = otherClock.hr, this.min = otherClock.min, this.sec = otherClock.sec
public void makeCopy(CLock otherClock) {
    this.hr = otherClock.hr; 
    this.min = otherClock.min; 
    this.sec = otherClock.sec;
} // end of makeCopy

// method to return a copy of the time
// postcondition: a copy of the object is created 
// and a reference of the copy is returned
public CLock getCopy() {
    CLock tempClock = new CLock();
    tempClock.hr = this.hr;
    tempClock.min = this.min;
    tempClock.sec = this.sec;

    return tempClock;
} // end method getCopy

// overrride the method to toString
public String toString() {
    String str = "";
    if (this.hr < 10) {
        str = "0";
    }
    str = str + this.hr + ":";
    if (this.min < 10) {
        str = str + "0";
    }
    str = str + this.min + ":";
    if (this.sec < 10) {
        str = str + "0";
    }
    str = str + this.sec;
    return str;
}


} //end of class clock