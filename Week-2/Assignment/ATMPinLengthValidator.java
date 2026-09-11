import java.util.Scanner;

/**
 * Program to validate an ATM PIN based on its length.
 */
public class ATMPinLengthValidator {

    /**
     * Checks whether the PIN has exactly 4 digits.
     *
     * @param pin ATM PIN entered by the user
     */
    static void validatePin(String pin) {
        if (pin.matches("\\d{4}")) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }

    /**
     * Takes PIN input and validates it.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ATM PIN: ");
        String pin = scanner.nextLine();

        validatePin(pin);

        scanner.close();
    }
}