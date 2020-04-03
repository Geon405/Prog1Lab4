/*
 * Program that check it is a palindrome or not.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author geonkim
 */
public class Palindrome1 {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        // prompt the user to enter the sentence.
        System.out.print("Enter the sentence: ");
        String str = kb.nextLine();

        // prints the result if it is palindrome or not.
        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
