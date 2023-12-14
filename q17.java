/*
 * Write a class “circle” with radius as data member and count the number of instances 
created using
default constructor only. [Constructor Chaining]
 */
public class q17 {
    private double radius;
    private static int instanceCount = 0;

    // Default constructor with constructor chaining
    public Circle() {
        this(1.0); // Calling parameterized constructor with default radius 1.0
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
        instanceCount++;
        System.out.println("Parameterized constructor called. Radius: " + radius);
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for instanceCount
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        // Creating instances of Circle using the default constructor
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        // Displaying information about the circles
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius());

        // Displaying the count of instances created
        System.out.println("Number of instances created: " + Circle.getInstanceCount());
    }

}
