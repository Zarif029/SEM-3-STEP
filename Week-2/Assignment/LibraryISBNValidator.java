import java.util.Scanner;

/**
 * Program to normalize and validate a library ISBN code.
 */
public class LibraryISBNValidator {

    /**
     * Normalizes and validates the given library code.
     *
     * @param code input library code
     */
    static void validateISBN(String code) {
        code = code.trim();

        if (code.length() != 13) {
            System.out.println("Invalid: Wrong length.");
            return;
        }

        String publisher = code.substring(0, 3).toUpperCase();
        String body = code.substring(3);

        for (int i = 0; i < publisher.length(); i++) {
            if (!Character.isLetter(publisher.charAt(i))) {
                System.out.println("Invalid: Publisher code must contain letters.");
                return;
            }
        }

        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                System.out.println("Invalid: Body must contain digits.");
                return;
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("[")
              .append(publisher)
              .append("] YEAR: ")
              .append(body.substring(0, 4))
              .append(" | CATALOG: ")
              .append(body.substring(4));

        System.out.println(result);
    }

    /**
     * Takes input from the user.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter library ISBN code: ");
        String code = scanner.nextLine();

        validateISBN(code);

        scanner.close();
    }
}