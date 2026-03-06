/**
 * ================================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Goal:
 * Check palindrome using recursion.
 *
 * Flow:
 * - Recursive call compares start & end characters
 * - Base condition exits recursion
 * - Result is printed
 *
 * Key Concepts:
 * - Recursion
 * - Base Condition
 * - Call Stack
 *
 * Data Structure Used:
 * Call Stack
 *
 * @author Developer
 * @version 9.0
 */

public class PalindromeCheckerApp {

    /**
     * Recursive method to check palindrome
     */
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Call recursive function
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Display result
        if (result) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}