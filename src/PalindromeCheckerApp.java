import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";


        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}