import java.util.*;

public class PalindromeUC13 {

    // Method 1: Reverse String
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // Method 3: Two Pointer Method
    public static boolean twoPointerMethod(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Palindrome Performance Comparison =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        // Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Two Pointer Method
        long start3 = System.nanoTime();
        boolean result3 = twoPointerMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Two Pointer Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}