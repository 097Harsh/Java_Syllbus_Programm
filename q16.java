/*
 * Write programs in Java to use Wrapper class of each primitive data types.
 */

public class q16 {

    public static void main(String[] args) {
        // Integer Wrapper Class (int)
        Integer intWrapper = new Integer(42); // Constructor with int argument
        int intValue = intWrapper.intValue(); // Converting back to int
        System.out.println("Integer Wrapper Class Example: " + intValue);

        // Double Wrapper Class (double)
        Double doubleWrapper = new Double(3.14); // Constructor with double argument
        double doubleValue = doubleWrapper.doubleValue(); // Converting back to double
        System.out.println("Double Wrapper Class Example: " + doubleValue);

        // Character Wrapper Class (char)
        Character charWrapper = new Character('A'); // Constructor with char argument
        char charValue = charWrapper.charValue(); // Converting back to char
        System.out.println("Character Wrapper Class Example: " + charValue);

        // Boolean Wrapper Class (boolean)
        Boolean booleanWrapper = new Boolean(true); // Constructor with boolean argument
        boolean booleanValue = booleanWrapper.booleanValue(); // Converting back to boolean
        System.out.println("Boolean Wrapper Class Example: " + booleanValue);

        // Byte Wrapper Class (byte)
        Byte byteWrapper = new Byte((byte) 127); // Constructor with byte argument
        byte byteValue = byteWrapper.byteValue(); // Converting back to byte
        System.out.println("Byte Wrapper Class Example: " + byteValue);

        // Short Wrapper Class (short)
        Short shortWrapper = new Short((short) 32000); // Constructor with short argument
        short shortValue = shortWrapper.shortValue(); // Converting back to short
        System.out.println("Short Wrapper Class Example: " + shortValue);

        // Long Wrapper Class (long)
        Long longWrapper = new Long(123456789L); // Constructor with long argument
        long longValue = longWrapper.longValue(); // Converting back to long
        System.out.println("Long Wrapper Class Example: " + longValue);
    }
    
}
