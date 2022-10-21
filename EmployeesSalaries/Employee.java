package EmployeesSalaries;
// Employee.java
// Employee abstract class
public abstract class Employee {
    // declare dat member
    private final String firstname;
    private final String lastname;
    private final String socialSecurityNumber;
    
    // employee constructor
    public Employee(String firstname, String lastname, String socialSecurityNumber) {
        this.firstname = firstname;
        this.lastname = lastname; // the same as this.lastname = lastname
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // declare accessors (gettor)
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    public String toString() {
        return String.format("%s %s%nSocial security number: %s", 
        getFirstName(), getLastName(), getSocialSecurityNumber());
    } 

    // abstract method earnings must be overriden in concrete subclasses
    public abstract double earnings(); // no implementation here, it's empty



} // end abstract class
