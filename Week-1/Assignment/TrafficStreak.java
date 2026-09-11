import java.util.Scanner;

/**
 * Program to find the longest consecutive streak
 * of the same traffic signal in a signal log.
 */
public class TrafficStreak {

    /**
     * Finds and displays the longest consecutive streak.
     *
     * @param signalLog traffic signal log
     */
    static void findLongestStreak(String signalLog) {
        int longestStreak = 1;
        int currentStreak = 1;
        char streakSignal = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                streakSignal = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: " + longestStreak);
        System.out.println("Signal: " + streakSignal);
    }

    /**
     * Takes the signal log as input.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter traffic signal log: ");
        String signalLog = scanner.nextLine();

        if (signalLog.isEmpty()) {
            System.out.println("Error: Signal log cannot be empty.");
        } else {
            findLongestStreak(signalLog);
        }

        scanner.close();
    }
}