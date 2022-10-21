import java.util.ArrayList;
import java.util.Scanner;

/**
 * MedicalClinic.java
 * Contains the main method for the Medical Clinic App
 * @author Team 3
 * @version 1.0
 * @since March 20, 2022
 */

 public class MedicalClinic {
    static Scanner input = new Scanner(System.in);
    static Scanner inputInt = new Scanner(System.in);
    static ArrayList<DoctorPerson> doctors = new ArrayList<DoctorPerson>();
    static ArrayList<PatientPerson> patients = new ArrayList<PatientPerson>();
    static ArrayList<Treatment> treatments = new ArrayList<Treatment>();

    public static void main(String[] args) {
        boolean continueLoop = true; // controls main menu looping
        int selection; //used in making a menu selection

        //populate the ArrayLists to test the display methods. **Remove in final version**
        createTestArrayLists();

        do {
            try {
                System.out.println("Welcome to the Medical Clinic App. Please make a selection: ");
                System.out.println("(1) Register new doctor");
                System.out.println("(2) Register new patient");
                System.out.println("(3) Create new treatment plan");
                System.out.println("(4) Display all registered doctors");
                System.out.println("(5) Display all registered patients");
                System.out.println("(6) Display all treatment files");
                System.out.println("(7) Display name and specialization of registered doctors");
                System.out.println("(8) Display name and insurance details of registered patients");
                System.out.println("(9) Display more details on treatment files");
                System.out.println("(0) Exit");
                selection = input.nextInt();
                input.nextLine();

                switch (selection) {
                    case 1:
                        createDoctor();
                        break;
                    case 2:
                        createPatient();
                        break;
                    case 3:
                        createTreatment();
                        break;
                    case 4:
                        displayDoctors();
                        break;
                    case 5:
                        displayPatients();
                        break;
                    case 6:
                        displayTreatments();
                        break;
                    case 7:
                        searchDoctors();
                        break;
                    case 8:
                        searchPatients();
                        break;
                    case 9:
                        searchTreatments();
                        break;
                    case 0:
                        continueLoop = false;
                        break;                   
                }
            }
            catch (IllegalArgumentException iae) {
                System.err.println(iae);
                input.nextLine(); // discard input, so user can try again
            }
        } while (continueLoop);

        System.out.println("Thank you for using the Medical Clinic App");
        input.close();
        inputInt.close();
        System.exit(0);
        
    } // end method main

    //CREATE METHODS
    public static void createDoctor() { // takes user input to create a DoctorPerson object
        //declare local variables
        String firstName;
        String lastName;
        String address;
        String birthdate; // Input is taken as String and parsed as LocalDate when the constructor gets called
        String phone;
        String specialty; 

        System.out.println("Enter the doctor's first name: ");
        firstName = input.nextLine();
        System.out.println("Enter the doctor's last name: ");
        lastName = input.nextLine();
        System.out.println("Enter the doctor's address: ");
        address = input.nextLine();
        System.out.println("Enter the doctor's date of birth (in yyyy-MM-dd format): ");
        birthdate = input.nextLine();
        System.out.println("Enter the doctor's phone number (in (XXX)XXX-XXXX format): ");
        phone = input.nextLine();
        System.out.println("Enter the doctor's medical specialty: ");
        specialty = input.nextLine();

        DoctorPerson tempDoctor = new DoctorPerson(firstName, lastName, address, birthdate, phone, specialty);
        //tempDoctor.search();
        System.out.printf("%nCOMPLETED%n**New Doctor**%n%s%n", tempDoctor);
        doctors.add(tempDoctor);
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method createDoctor

    public static void createPatient() { // takes user input to create a PatientPerson object
        //declare local variables
        String firstName;
        String lastName;
        String address;
        String birthdate; // Input is taken as String and parsed as LocalDate when the constructor gets called
        String phone;
        String insurance; 

        System.out.println("Enter the patient's first name: ");
        firstName = input.nextLine();
        System.out.println("Enter the patient's last name: ");
        lastName = input.nextLine();
        System.out.println("Enter the patient's address: ");
        address = input.nextLine();
        System.out.println("Enter the patient's date of birth (in yyyy-MM-dd format): ");
        birthdate = input.nextLine();
        System.out.println("Enter the patient's phone number (in (XXX)XXX-XXXX format): ");
        phone = input.nextLine();
        System.out.println("Enter the patient's insurance provider: ");
        insurance = input.nextLine();

        PatientPerson tempPatient = new PatientPerson(firstName, lastName, address, birthdate, phone, insurance);
        System.out.printf("%nCOMPLETED%n**New Patient**%n%s%n", tempPatient);
        patients.add(tempPatient);
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method createDoctor

    public static void createTreatment() { // takes user input to create a Treatment object
        //declare local variables
        String treatmentType;
        String treatmentStartDate; // Input is taken as String and parsed as LocalDate when the constructor gets called
        int treatmentDuration;
        int treatmentFrequency;
        String doctorName;
        String patientName;

        System.out.println("Enter the type of treatment: ");
        treatmentType = input.nextLine();
        System.out.println("Enter the start date of treatment (in yyyy-MM-dd format): ");
        treatmentStartDate = input.nextLine();
        System.out.println("Enter the expected duration of treatment (weeks): ");
        treatmentDuration = inputInt.nextInt();
        System.out.println("Enter the frequency of treatment (visits/week): ");
        treatmentFrequency = inputInt.nextInt();
        System.out.println("Enter the full name of the doctor providing treatment: ");
        doctorName = input.nextLine();
        System.out.println("Enter the full name of the patient receiving treatment: ");
        patientName = input.nextLine();

        Treatment tempTreatment = new Treatment(treatmentType, treatmentStartDate, treatmentDuration, treatmentFrequency, doctorName, patientName);
        System.out.printf("%nCOMPLETED%n**New Treatment**%n%s%n", tempTreatment);
        treatments.add(tempTreatment);
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method createTreatment

    //DISPLAY METHODS
    public static void displayDoctors() { // loops through the ArrayList displaying info about each object
        for (DoctorPerson doctor : doctors) {
            System.out.print(doctor);
            System.out.println();
        }
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method displayDoctors

    public static void displayPatients() { // loops through the ArrayList displaying info about each object
        for (PatientPerson patient : patients) {
            System.out.println(patient);
            System.out.println();
        }
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method displayPatients

    public static void displayTreatments() { // loops through the ArrayList displaying info about each object
        for (Treatment treatment : treatments) {
            System.out.println(treatment);
            System.out.println();
        }
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method displayTreatments

    public static void searchDoctors() { // loops through the ArrayList displaying info about each object
        for (DoctorPerson doctor : doctors) {
            doctor.search();
        }
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method searchDoctors

    public static void searchPatients() { // loops through the ArrayList displaying info about each object
        for (PatientPerson patient : patients) {
            patient.search();
        }
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method searchPatients

    public static void searchTreatments() { // loops through the ArrayList displaying info about each object
        for (Treatment treatment : treatments) {
            treatment.search();
        }
        System.out.println("\nPress any key to continue... ");
        input.nextLine();
    } // end method searchTreatments

    //TEST METHODS
    public static void createTestArrayLists() { //used for testing of display methods
        DoctorPerson dr1 = new DoctorPerson("Brian", "Smith", "123 Internet Street", "1986-04-28", "(123)123-4567", "GP");
        DoctorPerson dr2 = new DoctorPerson("Indiana", "Jones", "123 Fake Street", "1899-07-01", "(123)123-5678", "Archaeology");
        DoctorPerson dr3 = new DoctorPerson("Dick", "McDoctorson", "123 Doctor Street", "1899-07-01", "(123)123-6543", "Surgery");
        doctors.add(dr1);
        doctors.add(dr2);
        doctors.add(dr3);

        PatientPerson patient1 = new PatientPerson("Jim", "Maloney", "123 Fake Street", "1988-08-08", "(123)123-4567", "Gecko's Insurance");
        PatientPerson patient2 = new PatientPerson("Mary", "Wilson", "213 Liberty Avenue", "1999-10-19", "(123)666-7777", "Organized Insurance Co.");
        PatientPerson patient3 = new PatientPerson("Theresa", "Marks", "321 Patient Boulevard", "1950-07-08", "(123)123-4455", "Unreliant Insurance");
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        Treatment treat1 = new Treatment("arm pain", "2022-04-10", 10, 1, "Brian Smith", "Jim Maloney");
        Treatment treat2 = new Treatment("throat pain", "2022-04-15", 5, 3, "Indiana Jones", "Jim Maloney");
        Treatment treat3 = new Treatment("arm pain", "2019-05-01", 1, 3, "Indiana Jones", "Mary Wilson");
        treatments.add(treat1);
        treatments.add(treat2);
        treatments.add(treat3);

    } // end method createTestArrayLists

} // end class MedicalClinic
