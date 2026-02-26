import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Input String    : " + input);
        System.out.println("Reversed String : " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
