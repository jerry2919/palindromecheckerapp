import java.util.LinkedList;
import java.util.Scanner;



public class PalindromeCheckerApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        LinkedList<Character> list = new LinkedList<>();

        // Convert string to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}