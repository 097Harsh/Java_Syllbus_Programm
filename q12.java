public class q12 {
    private int enrollmentNo;
    private String name;
    private String gender;
    private double marks;
    private static int count = 0; // Static variable to store the count of objects

    // Constructor to initialize instance variables
    public Student(int enrollmentNo, String name, String gender, double marks) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        count++; // Increment the count each time a new object is created
    }

    // Display method to show student information
    public void display() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Marks: " + marks);
    }

    // Static method to get the count of objects
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Create instances of the Student class
        q12 student1 = new Student(1, "John", "Male", 85.5);
        q12 student2 = new Student(2, "Emily", "Female", 92.0);

        // Display information for each student
        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();

        // Get and display the count of objects
        System.out.println("\nTotal number of students: " + q12.getCount());
    }
}
