import java.util.Scanner;

/**
 * Program to calculate BMI and health status
 * for multiple team members.
 */
public class BMI {

    /**
     * Calculates BMI using weight and height.
     *
     * @param weight weight in kilograms
     * @param height height in meters
     * @return calculated BMI
     */
    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Determines BMI status.
     *
     * @param bmi calculated BMI
     * @return BMI status
     */
    static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    /**
     * Displays BMI and status for all team members.
     *
     * @param weights array of weights
     * @param heights array of heights
     */
    static void displayBMI(double[] weights, double[] heights) {
        System.out.println("\n===== BMI Report =====");

        for (int i = 0; i < weights.length; i++) {
            double bmi = calculateBMI(weights[i], heights[i]);

            System.out.printf("Person %d: BMI = %.2f, Status = %s%n",
                    i + 1, bmi, getStatus(bmi));
        }
    }

    /**
     * Takes team member details as input.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int numberOfMembers = scanner.nextInt();

        if (numberOfMembers <= 0) {
            System.out.println("Error: Number of members must be greater than 0.");
            scanner.close();
            return;
        }

        double[] weights = new double[numberOfMembers];
        double[] heights = new double[numberOfMembers];

        for (int i = 0; i < numberOfMembers; i++) {
            System.out.print("Enter weight (kg) for Person "
                    + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (m) for Person "
                    + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Error: Weight and height must be positive.");
                scanner.close();
                return;
            }
        }

        displayBMI(weights, heights);

        scanner.close();
    }
}