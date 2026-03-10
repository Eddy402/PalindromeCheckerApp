/**
 * UseCase2PalindromeCheckerApp
 *
 * Demonstrates checking whether a hardcoded string
 * is a palindrome and printing the result.
 *
 * Palindrome Checker App - Version 2.0
 *
 * @author Edson
 * @version 2.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome condition
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}