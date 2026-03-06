/**
 * ================================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Singly Linked List Palindrome Checker
 *
 * Goal:
 * Check palindrome using singly linked list.
 *
 * Flow:
 * - Convert string to linked list
 * - Find middle using fast and slow pointers
 * - Reverse second half of list
 * - Compare first and second halves
 *
 * Key Concepts:
 * - Singly Linked List
 * - Node Traversal
 * - Fast and Slow Pointer Technique
 * - In-place Reversal
 *
 * Data Structure Used:
 * Singly Linked List
 *
 * @author Developer
 * @version 8.0
 */

public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String input = "level";

        // Convert string to linked list
        Node head = null;
        Node tail = null;

        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 1: Find middle using fast & slow pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome = true;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}