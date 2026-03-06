/**
 * UseCase13: Performance Comparison
 * Palindrome Checker App
 */

import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

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

    // Method 3: Deque Method
    public static boolean dequeMethod(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "racecar";

        System.out.println("Input String : " + input);
        System.out.println("\nPerformance Comparison\n");

        // Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Deque Method
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();

        // Display Results
        System.out.println("Reverse Method Result : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns\n");

        System.out.println("Stack Method Result : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns\n");

        System.out.println("Deque Method Result : " + result3);
        System.out.println("Execution Time : " + (end3 - start3) + " ns\n");

        System.out.println("Program executed successfully.");
    }
}