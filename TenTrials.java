/*
 * program that generates a random number between 0 and 100
 * and asks the user to guess it.
 */
package lab4;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author geonkim
 */
public class TenTrials {
    
    public static void main (String[] args) {
       
        boolean bolAnswer = true;
        while (bolAnswer) {
            bolAnswer = false;
            Scanner console = new Scanner (System.in);
            
            Random rand = new Random();
            int randNum = rand.nextInt(101);
            
            System.out.println("You have 10 tries to guess an integer in the range 0-100");
            System.out.println(randNum);
            
            String garbage;
            boolean numFound = false;
            
            String pos = "yes";
            String neg = "no";
            
            for (int i = 0; i < 10 && (numFound == false); i++) {
                System.out.print("\nEnter your guess: ");
                int guess = console.nextInt();
                
                if (guess == randNum) {
                    numFound = true;
                    System.out.println("You have guessed the right number: " + randNum);
                    System.out.println("To play again, enter yes or no: ");
                    String answer = console.next().trim();
                    
                    if (pos.equals(answer)) {
                        System.out.println("Good job");
                        bolAnswer = true;
                    }
                }
            }
            System.out.println("Game Over!");
        }
    }
}
