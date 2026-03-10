import java.util.Stack;

/**
 * UseCase5PalindromeCheckerApp
 *
 * Demonstrates palindrome checking using a Stack data structure.
 * The stack reverses the characters using LIFO principle.
 *
 * @author Edson
 * @version 5.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String word = "madam";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push characters into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Build reversed string by popping characters
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed strings
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}