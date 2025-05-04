/**
 * Abstract Person class that serves as the parent class for all people in the hospital system.
 * Contains common attributes (name, age) and defines the register abstract method
 * that all subclasses must implement.
 */
abstract class Person {
    // Private instance variables
    private String name;            
    private int age;
    
    /**
     * Constructor for Person class
     * @param nameP The name of the person
     * @param ageP The age of the person
     */
    public Person(String nameP, int ageP) {
        this.name = nameP;
        this.age = ageP;
    }
    
    /**
     * Getter method for name
     * @return The person's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter method for age
     * @return The person's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Abstract method for registration that must be implemented by all subclasses
     */
    public abstract void register();
}
