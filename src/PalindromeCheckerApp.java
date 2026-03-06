/**
 * ================================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Goal:
 * Ignore spaces and case while checking a palindrome.
 *
 * Flow:
 * - Normalize the string
 * - Remove spaces using regular expressions
 * - Convert to lowercase
 * - Apply palindrome logic
 *
 * Key Concepts:
 * - String preprocessing
 * - Regular expressions
 * - Case normalization
 *
 * Data Structure Used:
 * String / Character Array
 *
 * @author Developer
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original input string
        String input = "Never Odd Or Even";

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Two-pointer palindrome check
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}