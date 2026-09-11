import java.util.Scanner;

/**
 * Program to reverse a customer name
 * without modifying the original name.
 */
public class ReverseName {

    /**
     * Reverses the given customer name.
     *
     * @param customerName original customer name
     * @return reversed customer name
     */
    static String reverseCustomerName(String customerName) {
        String reversed = "";

        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversed += customerName.charAt(i);
        }

        return reversed;
    }

    /**
     * Takes customer name as input and displays
     * the original and reversed name.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        if (customerName.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
        } else {
            String reversedName = reverseCustomerName(customerName);

            System.out.println("Original Name: " + customerName);
            System.out.println("Reversed Name: " + reversedName);
        }

        scanner.close();
    }
}