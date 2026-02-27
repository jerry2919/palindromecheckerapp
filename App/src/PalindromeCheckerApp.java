import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {




        public static void main(String[] args) {


            String input = "civic";


            Queue<Character> queue = new LinkedList<>();

            // Create Stack (LIFO)
            Stack<Character> stack = new Stack<>();

            // Insert characters into both queue and stack
            for (char c : input.toCharArray()) {
                queue.add(c);      // Enqueue
                stack.push(c);     // Push
            }

            // Assume palindrome initially
            boolean isPalindrome = true;

            // Compare dequeue and pop
            while (!queue.isEmpty()) {

                if (queue.remove() != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }