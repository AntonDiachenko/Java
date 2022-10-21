package EmployeesSalaries;

public class HourlyEmployee extends Employee {

    // declare data members
    private double wage; // wage per hour
    private double hours; // hours worked for week

    // constructor with five parameters
    public HourlyEmployee(String theFirstName, String theLastName, String theSocialSecurityNumber,
            double wage, double hours) {
        super(theFirstName, theLastName, theSocialSecurityNumber);
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 or <= 168.0");
        }
        this.hours = hours;
        this.wage = wage;
    } // end constructor

    //set employee wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be positive.");
        }
        this.wage = wage;
    }

    // return wage
    public double getWage() {
        return wage;
    }

    // set worked hours
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 or <= 168.0");
        } 
        this.hours = hours;
    }

    // return worked hours
    public double getHours() {
        return hours;
    }

// calculate earnings - override abstract method earnings in Employee abstract class
    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() -40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly employee:%s%n%s: $%,.2f; %s: %,.2f",
        super.toString(), "hourly wage", getWage(), "hours worked", getHours() );
    }
 
} // end class
