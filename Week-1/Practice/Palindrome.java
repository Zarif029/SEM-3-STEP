import java.util.Scanner;

/**
 * Program to check whether a string is a palindrome
 * using three different approaches.
 */
public class Palindrome {

    /**
     * Checks palindrome using iteration.
     */
    static boolean checkIterative(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks palindrome using recursion.
     */
    static boolean checkRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkRecursive(text, start + 1, end - 1);
    }

    /**
     * Checks palindrome by reversing the string using an array.
     */
    static boolean checkArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        return String.valueOf(original).equals(String.valueOf(reversed));
    }

    /**
     * Takes input and displays results from all approaches.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("Error: String cannot be empty.");
        } else {
            System.out.println("Iterative: " + checkIterative(text));
            System.out.println("Recursive: "
                    + checkRecursive(text, 0, text.length() - 1));
            System.out.println("Array Reversal: " + checkArray(text));
        }

        scanner.close();
    }
}