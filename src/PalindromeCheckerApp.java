import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Two Pointer Approach
    public static boolean twoPointerPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    // Method 2: Stack Approach
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    // Method 3: Recursive Approach
    public static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        // Recursive Timing
        long start3 = System.nanoTime();
        boolean result3 = recursivePalindrome(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Two Pointer Approach: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Approach: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Recursive Approach: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}