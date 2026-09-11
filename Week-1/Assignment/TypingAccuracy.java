import java.util.Scanner;

/**
 * Program to check typing accuracy by comparing
 * an original string with a typed string.
 */
public class TypingAccuracy {

    /**
     * Compares two strings and calculates typing accuracy.
     *
     * @param original original text
     * @param typed text entered by the user
     */
    static void checkTypingAccuracy(String original, String typed) {
        int matchingCharacters = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchingCharacters++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (matchingCharacters * 100.0) / original.length();

        System.out.println("Matching Characters: " + matchingCharacters);
        System.out.println("Accuracy: " + accuracy + "%");

        if (firstMismatch == -1) {
            System.out.println("No mismatch found.");
        } else {
            System.out.println("First Mismatch Position: " + firstMismatch);
        }
    }

    /**
     * Takes input and calls the accuracy checking method.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        if (original.length() != typed.length()) {
            System.out.println("Error: Both strings must have equal length.");
        } else if (original.length() == 0) {
            System.out.println("Error: Text cannot be empty.");
        } else {
            checkTypingAccuracy(original, typed);
        }

        scanner.close();
    }
}