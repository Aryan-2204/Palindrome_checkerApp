/**
 * ================================================================
 * CLASS – PalindromeChecker
 * ================================================================
 *
 * This class encapsulates the palindrome checking logic.
 * It exposes a public method checkPalindrome() that verifies
 * whether a given string is a palindrome.
 *
 * Key OOP Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 */

class PalindromeChecker {

    /**
     * Method to check if a string is palindrome
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


/**
 * ================================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ================================================================
 *
 * Goal:
 * Demonstrate Object-Oriented design by separating
 * palindrome logic into a service class.
 *
 * Flow:
 * - Create PalindromeChecker object
 * - Call checkPalindrome() method
 * - Display result
 *
 * Key Concepts:
 * - Encapsulation
 * - Object creation
 * - Method invocation
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "racecar";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        // Print result
        if (result) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}