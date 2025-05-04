/**
 * Patient class that extends the Person class.
 * Contains specific attributes and behavior for patients in the hospital.
 */
public class Patient extends Person {
    // Private instance variable specific to Patient
    private String illness;
    
    /**
     * Constructor for Patient class
     * @param nameP The name of the patient
     * @param ageP The age of the patient
     * @param illnessP The illness of the patient
     */
    public Patient(String nameP, int ageP, String illnessP) {
        // Call the parent constructor to initialize name and age
        super(nameP, ageP);
        this.illness = illnessP;
    }
    
    /**
     * Getter method for illness
     * @return The patient's illness
     */
    public String getIllness() {
        return illness;
    }
    
    /**
     * Implementation of the abstract register method
     * Prints a welcome message for patients
     */
    public void register() {
        System.out.println("Welcome Patient!");
    }
}
