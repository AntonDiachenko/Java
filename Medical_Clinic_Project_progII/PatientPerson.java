/**
* PatientPerson.java
* PatientPerson is a concrete class that extends the abstract class Person
*
* @author Team 3
* @version 1.1
* @since March 20, 2022
*/

public class PatientPerson extends Person implements SearchBy{

    // declare data members
    private String insuranceCompany;

    // define constructor
    public PatientPerson(String aFirstName, String aLastName, String anAddress, String aBirthdate,
    String aPhone, String anInsuranceCompany) {
        super(aFirstName, aLastName, anAddress, aBirthdate, aPhone);
        setInsuranceCompany(anInsuranceCompany);
    } // end constructor Patient

    // seter method
    public void setInsuranceCompany(String anInsuranceCompany) {
        if (anInsuranceCompany.length() < 1) { //Validation: cannot be empty String
            throw new IllegalArgumentException("Insurance Company cannot be empty");
        }
        this.insuranceCompany = anInsuranceCompany;
    } // end setter method

    // getter method
    public String getInsuranceCompany() {
        return this.insuranceCompany;
    } // end getter method

    // overridden toString method

    public void search(){
        System.out.println("Patient " + super.getName() + " has insurance with " + this.getInsuranceCompany());
    }

    @Override
    public String toString() {
        return String.format("Patient: %s%s: %s%n", super.toString(),"Insurance Company", getInsuranceCompany());
    }

    
} // end Patient extends Person class
