/*
 * Write a Java application to count and display frequency of letters and digits from the 
String
given by user as command-line argument.
 */
public class q11 {
    public static void main(String args[]){
        if(args.length < 1){
            System.out.println("Please provide a string for command-line argunment");
            return;
        }
        String input = args[0];
        int lettercount = 0;
        int digitcount = 0;

        for(char c:input.toCharArray()){
            if (Character.isLetter(c)) {
                lettercount++;
            }
            else if(Character.isDigit(c)){
                digitcount++;
            }
        }
        System.out.println("String:"+input);
        System.out.println("Letter count:"+lettercount);
        System.out.println("Digit count:"+digitcount);
    }
}
/*Output : 
 * C:\Users\91971\Documents\mca\sem - 1\java>java q11 harshshah6966
String:harshshah6966
Letter count:9
Digit count:4
 */