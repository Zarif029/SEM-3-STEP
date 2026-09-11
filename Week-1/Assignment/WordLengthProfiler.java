import java.util.Scanner;

/**
 * Program to classify words based on their length.
 */
public class WordLengthProfiler {

    /**
     * Classifies words as Short, Medium, or Long.
     *
     * @param review movie review text
     */
    static void classifyWordLengths(String review) {
        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        String[] words = review.split("\\s+");

        for (String word : words) {
            int length = word.length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short Words: " + shortWords);
        System.out.println("Medium Words: " + mediumWords);
        System.out.println("Long Words: " + longWords);
    }

    /**
     * Takes the movie review as input.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = scanner.nextLine();

        if (review.trim().isEmpty()) {
            System.out.println("Error: Review cannot be empty.");
        } else {
            classifyWordLengths(review);
        }

        scanner.close();
    }
}