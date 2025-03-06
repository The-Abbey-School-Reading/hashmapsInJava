import java.util.HashMap;

public class FirstExample {



    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add some students and their grades
        studentGrades.put("Alice", 90);
        studentGrades.put("Bella", 85);
        studentGrades.put("Catherine", 92);

        // Print the HashMap
        System.out.println("Student Grades: " + studentGrades);

        // Get a grade for a specific student
        String student = "Bella";
        int grade = studentGrades.get(student);
        System.out.println(student + "'s grade: " + grade);

        // Check if a student is in the HashMap
        String newStudent = "Diana";
        if (studentGrades.containsKey(newStudent)) {
            System.out.println(newStudent + " is in the class.");
        } else {
            System.out.println(newStudent + " is not in the class.");
        }

        // Remove a student from the HashMap
        studentGrades.remove("Alice");
        System.out.println("Updated Student Grades: " + studentGrades);
    }
}
