/*
 * Program to check that it is a palindrome or not.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author geonkim
 */
public class Palindrom2 {
    
    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your string: ");
        String input = sc.nextLine();
        
        Character forward, backward;
        boolean mismatch = false;
        
        for (int i = 0, j = input.length()-1; i < input.length()/2; i++, j--) {
            if (!mismatch) {
                forward = input.charAt(i);
                
                while (! Character.isLetter(forward)) {
                    i++;
                    forward = input.charAt(i);
                }
                forward = Character.toLowerCase(forward);
            }
        }
    }
}
