//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

/**
 * DoctorPerson.java
 * DoctorPerson is a concrete class that extends the abstract class Person
 * 
 * @author Team 3
 * @version 1.1
 * @since March 19, 2022
 */

// define constructor
public class DoctorPerson extends Person implements SearchBy{
    // declare data members
    private String specialty;

    // define constructor
    public DoctorPerson(String aFirstName, String aLastName, String anAddress, String aBirthdate, String aPhone,
            String aSpecialty) {
        super(aFirstName, aLastName, anAddress, aBirthdate, aPhone);
        setSpecialty(aSpecialty);
    } // end DoctorPerson constructor

    // setSpecialty
    public void setSpecialty(String aSpecialty) {
        if (aSpecialty.length() < 2) { // validate specialty. Even abbreviated, medical specialties are at least 2 characters.
            throw new IllegalArgumentException(
                    "The specialty length is too short, it must be at least 2 characters long.");
        } // end if block
        if (aSpecialty.matches("[0-9]+")) { // validate specialty. Specialty cannot only contain digits
            throw new IllegalArgumentException("Specialty cannot only contain digits");
        } // end if block
        this.specialty = aSpecialty;
    } // end method setSpecialty

    // get specialty
    public String getSpecialty() {
        return this.specialty;
    } // end method getSpecialty

    // return string representation of the specialty

    public void search(){
        System.out.println("Doctor " + super.getName() + " is specialised in " + this.specialty);
/*        Map<String, List<String>> hm = new HashMap<String, List<String>>();
        List<String> values = new ArrayList<String>();
        values.add(specialty);
        values.add(super.getFirstName());
        hm.put("Key1", values);
        System.out.println(hm.get("key1"));*/
    }


    @Override
    public String toString() {
        return String.format("Doctor: %s%s %s%n", super.toString(), "Specialty:", getSpecialty());
    } // end method toString

} // end class Doctor


