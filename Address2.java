/*
 * TProgram to check that the email is valid or not.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author geonkim
 */
public class Address2 {
    
    public static void main (String[] args) {
        
        Scanner console = new Scanner(System.in);
        String email = console.next();
        
        boolean foundAt = false;
        boolean foundDot = false;
        
        for (int i = 0; i < email.length(); i++) {
            if (!foundAt) {
                if (email.charAt(i)=='@') {
                    foundAt = true;
                }
            } else if (!foundDot) {
                if (email.charAt(i)=='.') {
                    foundDot = true;
                }
            }
        }
        if (foundAt && foundDot) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
