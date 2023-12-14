/*
 * Create a class “Vehicle” with instance variable vehicle_type. Inherit the class in a 
class called “Car” with instance model_type, company name etc. display the 
information of the vehicle by defining the display() in both super and sub class [ 
Method Overriding]

 */
// Superclass
class Vehicle {
    protected String vehicle_type;

    // Constructor for Vehicle class
    public Vehicle(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    // Display method in the superclass
    public void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    private String model_type;
    private String company_name;

    // Constructor for Car class
    public Car(String vehicle_type, String model_type, String company_name) {
        super(vehicle_type);
        this.model_type = model_type;
        this.company_name = company_name;
    }

    // Override the display method in the subclass
    @Override
    public void display() {
        super.display(); // Call the display method of the superclass
        System.out.println("Model Type: " + model_type);
        System.out.println("Company Name: " + company_name);
    }
}

public class q18 {
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car("Four Wheeler", "Sedan", "Toyota");

        // Calling the display method of the Car class
        myCar.display();
    }
}
