import java.util.Scanner;

/**
 * Program to find duplicate seat numbers in an exam hall.
 * Uses an integer array and nested comparisons.
 */
public class ExamHallSeatDuplication {

    /**
     * Checks and displays duplicate seat numbers.
     *
     * @param seatNumbers array containing seat numbers
     */
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean found = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            boolean alreadyPrinted = false;

            // Check whether this seat was already displayed
            for (int k = 0; k < i; k++) {
                if (seatNumbers[i] == seatNumbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check whether the seat number occurs again
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat: " + seatNumbers[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate seats found.");
        }
    }

    /**
     * Takes input and calls the duplicate checking method.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int numberOfSeats = scanner.nextInt();

        int[] seatNumbers = new int[numberOfSeats];

        System.out.println("Enter seat numbers:");
        for (int i = 0; i < numberOfSeats; i++) {
            seatNumbers[i] = scanner.nextInt();
        }

        checkDuplicateSeats(seatNumbers);

        scanner.close();
    }
}
