public class UseCase1PalindromeCheckerApp {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    /**
     * Main Method - Entry point of the application
     * JVM invokes this method automatically.
     */
    public static void main(String[] args) {

        displayWelcomeMessage();

        // Flow continues to next use case (future implementation)
        System.out.println("\nApplication initialized successfully.");
    }

    /**
     * Displays application name and version.
     */
    private static void displayWelcomeMessage() {
        System.out.println("======================================");
        System.out.println("      " + APP_NAME);
        System.out.println("      " + APP_VERSION);
        System.out.println("======================================");
    }
}