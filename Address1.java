/*
 * Program that check the email is valid or not.
 */
package lab4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author geonkim
 */
public class Address1 {
    static boolean isValid(String email) {
        String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(regex);
    }
    
    /**
     *
     * @param args
     */
    public static void main (String[]args) {
        Scanner console = new Scanner(System.in);
        // prompt the user to enter the email address.
        System.out.print("Enter your email address: ");
        String email_address = console.nextLine();
        
        // prints the email address.
        System.out.println("The Email address is: " + email_address);
        // prints the result its valid or not.
        System.out.println("Is the above email address is valid?: " + isValid(email_address));
    }
}