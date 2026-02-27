public class PalindromeCheckerApp {


        public static void main(String[] args) {

            // Hardcoded string
            String input = "madam";

            String reversed = "";

            // Reverse string using loop
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            // Compare original and reversed
            if (input.equals(reversed)) {
                System.out.println("The given string is a Palindrome.");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }
        }
    }