import java.util.Scanner;

/**
 * Program to find the first non-repeating character
 * in a given string.
 */
public class NonRepeatingCharacter {

    /**
     * Finds the first character that appears only once.
     *
     * @param text input string
     * @return first non-repeating character
     */
    static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    /**
     * Takes input and displays the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("Error: String cannot be empty.");
        } else {
            char result = findFirstNonRepeatingChar(text);

            if (result == '\0') {
                System.out.println("No non-repeating character found.");
            } else {
                System.out.println(
                        "First Non-Repeating Character: " + result);
            }
        }

        scanner.close();
    }
}