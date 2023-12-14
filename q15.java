/*
 * write a java program static block which will be executed before main ( ) method in a 
class
 */
public class q15 {
 
    // Static block
    static {
        System.out.println("Hello this is a static block");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Hello this is  the main() method.");
    }
    
}
