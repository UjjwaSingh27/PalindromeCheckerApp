import java.util.Scanner;

/**
 * =====================================================
 * MAIN CLASS - UseCase9RecursivePalindromeCheckerApp
 * =====================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using recursion. The first and last characters are
 * compared and the function calls itself for the
 * remaining substring.
 *
 * Key Concepts:
 * - Recursion
 * - Base Condition
 * - Call Stack
 *
 * @author Developer
 * @version 9.0
 */

public class PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    /**
     * Application entry point for UC9
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}