import java.util.Scanner;

/**
 * Program to parse a product inventory CSV record.
 */
public class ProductInventoryCSVParser {

    /**
     * Parses and displays an inventory record.
     *
     * @param csvLine product CSV data
     */
    static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0]
                    + " | SKU: " + fields[1]
                    + " | Qty: " + fields[2]);
        }
    }

    /**
     * Takes CSV input from the user.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inventory record: ");
        String csvLine = scanner.nextLine();

        parseInventoryRecord(csvLine);

        scanner.close();
    }
}