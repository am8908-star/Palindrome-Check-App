/**
 * UseCase10: Case-Insensitive & Space-Ignored Palindrome
 * Palindrome Checker App
 * Version: 1.0
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "A man a plan a canal Panama";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Original String  : " + input);
        System.out.println("Normalized String: " + normalized);

        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}