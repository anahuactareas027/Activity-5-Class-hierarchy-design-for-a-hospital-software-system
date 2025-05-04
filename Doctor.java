/**
 * Doctor class that extends the Person class.
 * Contains specific attributes and behavior for doctors in the hospital.
 */
public class Doctor extends Person {
    // Private instance variable specific to Doctor
    private String department;
    
    /**
     * Constructor for Doctor class
     * @param nameD The name of the doctor
     * @param ageD The age of the doctor
     * @param departmentD The department where the doctor works
     */
    public Doctor(String nameD, int ageD, String departmentD) {
        // Call the parent constructor to initialize name and age
        super(nameD, ageD);
        this.department = departmentD;
    }
    
    /**
     * Getter method for department
     * @return The doctor's department
     */
    public String getDepartment() {
        return department;
    }
    
    /**
     * Implementation of the abstract register method
     * Prints a welcome message for doctors
     */
    public void register() {
        System.out.println("Welcome Doctor!");
    }
}
