import java.util.Scanner;

/**
 * Program to reverse each word in a sentence
 * while keeping the word order unchanged.
 */
public class WordReversalEncoder {

    /**
     * Reverses every word in the sentence.
     *
     * @param sentence input sentence
     * @return sentence with each word reversed
     */
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed.append(word.charAt(i));
            }

            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }

    /**
     * Takes a sentence as input and displays the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (sentence.isEmpty()) {
            System.out.println("Error: Sentence cannot be empty.");
        } else {
            System.out.println("Encoded Text: " + reverseEachWord(sentence));
        }

        scanner.close();
    }
}