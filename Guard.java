/**
 * Guard class that extends the Person class.
 * Contains specific attributes and behavior for guards in the hospital.
 * Features method overloading for the constructor.
 */
public class Guard extends Person {
    // Private instance variables specific to Guard
    private String shift;
    private String phone;
    
    /**
     * Constructor for Guard class (without phone)
     * @param nameG The name of the guard
     * @param ageG The age of the guard
     * @param shiftG The shift the guard works
     */
    public Guard(String nameG, int ageG, String shiftG) {
        // Call the parent constructor to initialize name and age
        super(nameG, ageG);
        this.shift = shiftG;
        this.phone = "Unknown"; // Default value when phone is not provided
    }
    
    /**
     * Overloaded constructor for Guard class (with phone)
     * @param nameG The name of the guard
     * @param ageG The age of the guard
     * @param shiftG The shift the guard works
     * @param phoneG The phone number of the guard
     */
    public Guard(String nameG, int ageG, String shiftG, String phoneG) {
        // Call the parent constructor to initialize name and age
        super(nameG, ageG);
        this.shift = shiftG;
        this.phone = phoneG;
    }
    
    /**
     * Getter method for shift
     * @return The guard's shift
     */
    public String getShift() {
        return shift;
    }
    
    /**
     * Getter method for phone
     * @return The guard's phone number
     */
    public String getPhone() {
        return phone;
    }
    
    /**
     * Implementation of the abstract register method
     * Prints a welcome message for guards
     */
    public void register() {
        System.out.println("Welcome Guard!");
    }
}
