import java.util.Scanner;

/**
 * Program to compare inventory quantities
 * between two warehouse sections.
 */
public class InventoryBalancer {

    /**
     * Analyzes two inventory sections and finds
     * their totals and maximum quantity.
     *
     * @param sectionA inventory of section A
     * @param sectionB inventory of section B
     */
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        int maxQuantity = sectionA[0];
        String maxSection = "A";
        int maxIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];

            if (sectionA[i] > maxQuantity) {
                maxQuantity = sectionA[i];
                maxSection = "A";
                maxIndex = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];

            if (sectionB[i] > maxQuantity) {
                maxQuantity = sectionB[i];
                maxSection = "B";
                maxIndex = i;
            }
        }

        System.out.println("Total Section A: " + totalA);
        System.out.println("Total Section B: " + totalB);

        if (totalA == totalB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }

        System.out.println("Maximum Quantity: " + maxQuantity);
        System.out.println("Section: " + maxSection);
        System.out.println("Index: " + maxIndex);
    }

    /**
     * Takes inventory values as input.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int numberOfItems = scanner.nextInt();

        int[] sectionA = new int[numberOfItems];
        int[] sectionB = new int[numberOfItems];

        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < numberOfItems; i++) {
            sectionA[i] = scanner.nextInt();
        }

        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < numberOfItems; i++) {
            sectionB[i] = scanner.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        scanner.close();
    }
}