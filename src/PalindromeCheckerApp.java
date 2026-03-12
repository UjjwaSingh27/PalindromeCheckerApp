import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Normalize string
        str = str.toLowerCase().replaceAll("\\s", "");

        // Reverse string
        String reversed = new StringBuilder(str).reverse().toString();

        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}