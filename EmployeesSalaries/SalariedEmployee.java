package EmployeesSalaries;

// SalariedEmployee is a concrete class that extends abstract class Employee
public class SalariedEmployee extends Employee{
    // declare data members
    private double weeklySalary;

    // define constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        } // end if block
        this.weeklySalary = weeklySalary;
    } // end constructor

    // set weekly salary method
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        } // end if block
        this.weeklySalary = weeklySalary;
    } // end method setWeeklySalary

    // return weekly salary
    public double getWeeklySalary() {
        return weeklySalary;        
    }

    // calculate earnings - override abstract method earning in Employee class
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    // return string representation of SalariedEmployee
    @Override
    public String toString() {
        return String.format("Salarid employee: %s %n %s: $%,.2f", 
        super.toString(), "weekly salary: ", getWeeklySalary());
    }


} // end class
