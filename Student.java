//it is q12
/*

Create a class “Student” that would contain enrollment No, name, and gender and 
marks as instance variables and count as static variable which stores the count of the 
objects; constructors and display(). Implement constructors to initialize instance 
variables.
*/ 
import java.util.Scanner;
public class Student {
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

        Scanner scanner = new Scanner(System.in);
        //ENTER FIRST STUDENT
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter your enrollment number:");
        int num = scanner.nextInt();
        System.out.println("Enter your Marks:");
        double marks = scanner.nextDouble();
        //Second student
        String name1 ="Het";
        System.out.println("Enter your gender:");
        String gender1 = scanner.nextLine();
        System.out.println("Enter your enrollment number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter your Marks:");
        double marks1 = scanner.nextDouble();

        // Create instances of the Student class
        Student student1 = new Student(num, name, gender, marks);
        Student student2 = new Student(num,name1, gender1, marks1);

        // Display information for each student
        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();

        // Get and display the count of objects
        System.out.println("\nTotal number of students: " + Student.getCount());
    }
}
