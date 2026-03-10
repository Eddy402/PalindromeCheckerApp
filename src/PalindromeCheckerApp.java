/**
 * UseCase3PalindromeCheckerApp
 *
 * Demonstrates palindrome checking by reversing a string
 * using a for loop and comparing the result.
 *
 * @author Edson
 * @version 3.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}