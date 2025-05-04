/**
 * Main class to test the hospital class hierarchy
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of all classes using the test cases
        Doctor doctor = new Doctor("Joseph", 41, "Neurologist");
        Patient patient = new Patient("Richard", 78, "Chronic Headache");
        Guard guardMorning = new Guard("John", 39, "Morning");
        Guard guardAfternoon = new Guard("Kevin", 43, "Afternoon", "+52 232 456345");
        
        // Print information and register each person
        System.out.println("---- Doctor Information ----");
        System.out.println("Name: " + doctor.getName());
        System.out.println("Age: " + doctor.getAge());
        System.out.println("Department: " + doctor.getDepartment());
        doctor.register();
        
        System.out.println("\n---- Patient Information ----");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Illness: " + patient.getIllness());
        patient.register();
        
        System.out.println("\n---- Morning Guard Information ----");
        System.out.println("Name: " + guardMorning.getName());
        System.out.println("Age: " + guardMorning.getAge());
        System.out.println("Shift: " + guardMorning.getShift());
        System.out.println("Phone: " + guardMorning.getPhone());
        guardMorning.register();
        
        System.out.println("\n---- Afternoon Guard Information ----");
        System.out.println("Name: " + guardAfternoon.getName());
        System.out.println("Age: " + guardAfternoon.getAge());
        System.out.println("Shift: " + guardAfternoon.getShift());
        System.out.println("Phone: " + guardAfternoon.getPhone());
        guardAfternoon.register();
    }
}
