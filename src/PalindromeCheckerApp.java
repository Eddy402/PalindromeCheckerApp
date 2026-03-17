import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Using String reversal
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Using two-pointer technique
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Using Stack
    public static boolean isPalindromeStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input (optional: ignore case and spaces)
        String str = input.replaceAll("\\s+", "").toLowerCase();

        // Method 1 Timing
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(str);
        long end1 = System.nanoTime();

        // Method 2 Timing
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(str);
        long end2 = System.nanoTime();

        // Method 3 Timing
        long start3 = System.nanoTime();
        boolean result3 = isPalindromeStack(str);
        long end3 = System.nanoTime();

        // Display Results
        System.out.println("\n--- Results ---");
        System.out.println("Reverse Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Stack Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}