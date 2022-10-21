import java.time.LocalDate; // needed for LocalDate class (yyyy-MM-dd)
import java.time.format.DateTimeParseException;

/**
 * Person.java
 * Person abstract class to be extended by DoctorPerson and PatientPerson
 * 
 * @author Team 3
 * @version 1.1
 * @since March 18, 2022
 */

public abstract class Person { 
    // Data Members
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate birthdate; // Represents a date (year, month, day (yyyy-MM-dd))
    private String phone;

    // Constructors
    public Person(String aFirstName, String aLastName, String anAddress, String aBirthdate, String aPhone) {
        setFirstName(aFirstName);
        setLastName(aLastName);
        setAddress(anAddress);
        setBirthdate(aBirthdate);
        setPhone(aPhone);
    } // end constructor

    // Setter Methods
    public void setFirstName(String aFirstName) {
        if (aFirstName.matches("^[a-zA-Z]+$")) { //Validation: can only contain alpha characters and cannot be empty
            this.firstName = aFirstName;
        } else {
            throw new IllegalArgumentException("First Name must contain only letters");
        }
    }
    public void setLastName(String aLastName) {
        if (aLastName.matches("^[a-zA-Z]+$")) { //Validation: can only contain alpha characters and cannot be empty
            this.lastName = aLastName;
        } else {
            throw new IllegalArgumentException("Last Name must contain only letters");
        }
    }
    public void setAddress(String anAddress) {
        if (anAddress.length() < 1) { //Validation: cannot be empty String
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.address = anAddress;
    }
    public void setBirthdate(String aBirthdate) {
        if (aBirthdate.matches("^[0-9-]+$")) {
            try {
                this.birthdate = LocalDate.parse(aBirthdate);
            } catch (DateTimeParseException e) {
                System.out.println("Date of Birth must be in yyyy-MM-dd format");
            }
        }
        else{
            throw new IllegalArgumentException("Date of Birth must be in yyyy-MM-dd format");
        }
    }
    public void setPhone(String aPhone) {
        if (aPhone.matches("^[0-9()-]+$") && aPhone.charAt(0)=='(' && aPhone.charAt(4)==')' && aPhone.charAt(8)=='-' && aPhone.length()==13) { 
                            //Validation: can only contain digits, brackets and dashes at appropriate locations and enforces total length of 13
            this.phone = aPhone;
        } else {
            throw new IllegalArgumentException("Phone number must be in the (XXX)XXX-XXXX format");
        }
    }
    // end setters

    // Getter Methods
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getAddress() {
        return this.address;
    }
    public LocalDate getBirthdate() {
        return this.birthdate;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getName() {

        return (this.firstName + " " + this.lastName);
    }
    // end getters

    // Overridden toString method
    @Override
    public String toString() {
        return String.format("%s %s - %s: %s%n%s: %s, %s: %s%n", getFirstName(), getLastName(), 
            "Date of Birth", getBirthdate(), 
            "Address", getAddress(), 
            "Phone", getPhone());
    } // end method toString
    
} // end class Person