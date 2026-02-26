public class PalindromeCheckerApp {
        public static void main(String[] args) {

            // Display welcome message
            System.out.println("================================================");
            System.out.println("        Welcome to PalindromeChecker App       ");
            System.out.println("                  Version 1.0                  ");
            System.out.println("================================================");

            // Inform about current stage
            System.out.println("Application started successfully.");
            System.out.println("No palindrome logic implemented yet.");
            System.out.println("Startup flow established.");
            // Hardcoded string
            String input = "madam";

            boolean isPalindrome = true;

            // Loop only till half of the string length
            for (int i = 0; i < input.length() / 2; i++) {

                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            System.out.println("Input text: " + input);
            System.out.println("Is it a Palindrome? : " + isPalindrome);
            // Original string
            String original = "level";

            // Variable to store reversed string
            String reversed = "";

            // Iterate the string in reverse order
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            // Compare original and reversed strings
            if (original.equals(reversed)) {
                System.out.println("The word \"" + original + "\" is a Palindrome.");
            } else {
                System.out.println("The word \"" + original + "\" is NOT a Palindrome.");
            }
    }
}