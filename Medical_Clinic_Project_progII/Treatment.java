import java.time.LocalDate; // needed for LocalDate class (yyyy-MM-dd)
import java.time.format.DateTimeParseException;

/**
 * Treatement.java
 * Treatment is a concrete class that displays information about a patients treatment.
 *  Each Treatment is associated with one DoctorPerson and one PatientPerson
 * 
 * @author Team 3
 * @version 1.0
 * @since March 20, 2022
 */

public class Treatment implements SearchBy{
    // Data Members
    private String treatmentType;
    private LocalDate treatmentStartDate;
    private int treatmentDuration;
    private int treatmentFrequency;
    private String doctorName;
    private String patientName;

    // Constructor with Parameters
    public Treatment(String type, String startDate, int duration, int frequency, String doctorName, String patientName){
        setTreatmentType(type);
        setTreatmentStartDate(startDate);
        setTreatmentDuration(duration);
        setTreatmentFrequency(frequency);
        setDoctorName(doctorName);
        setPatientName(patientName);
    }

    //Setter Methods
    public void setTreatmentType(String type){
        if (type.length() < 1) {
            throw new IllegalArgumentException("Treatment Type cannot be empty");
        }
        this.treatmentType = type;
    }
    public void setTreatmentStartDate(String startDate){
        if (startDate.matches("^[0-9-]+$")) {
            try {
                this.treatmentStartDate = LocalDate.parse(startDate);
            } catch (DateTimeParseException e) {
                System.out.println("Date of Birth must be in yyyy-MM-dd format");
            }
        }
        else{
            throw new IllegalArgumentException("Date of Birth must be in yyyy-MM-dd format");
        }
    }
    public void setTreatmentDuration(int duration){
            if(duration < 1){
            throw new IllegalArgumentException("Treatment duration cannot be less than 1");
        }
        this.treatmentDuration = duration;
    }
    public void setTreatmentFrequency(int frequency){
        if(frequency < 1){
            throw new IllegalArgumentException("Frequency cannot be less than 1");
        }
        this.treatmentFrequency = frequency;
    }
    public void setDoctorName(String doctorName){
        if (doctorName.length() < 1) {
            throw new IllegalArgumentException("Doctor Name cannot be empty");
        }
        this.doctorName = doctorName;
    }
    public void setPatientName(String patientName){
        if (patientName.length() < 1) {
            throw new IllegalArgumentException("Patient Name cannot be empty");
        }
        this.patientName = patientName;
    }


    // Getter Methods
    public String getTreatmentType() {
        return treatmentType;
    }

    public LocalDate getTreatmentStartDate() {
        return treatmentStartDate;
    }

    public int getTreatmentDuration() {
        return treatmentDuration;
    }

    public int getTreatmentFrequency() {
        return treatmentFrequency;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void search(){
        System.out.println("Patient " + patientName + " is being treated by " + doctorName + " for " + treatmentType);
    }

    // Overridden toString method
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s, %s: %s%n%s: %s %n%s %d %s %d %s%n", 
            "Type of treatment", getTreatmentType(), 
            "For patient", getPatientName(), "Provided by Doctor", getDoctorName(), 
            "Starting", getTreatmentStartDate(), 
            "For a duration of", getTreatmentDuration(), "week(s), with", getTreatmentFrequency(), "visit(s) per week");
    }


} // end class