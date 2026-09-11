import java.util.Random;
import java.util.Scanner;

/**
 * Program to play a Rock-Paper-Scissors game
 * between the player and the computer.
 */
public class RockPaperScissors {

    /**
     * Determines the winner of one round.
     *
     * @param playerMove player's move
     * @param computerMove computer's move
     * @return result of the round
     */
    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("rock") && computerMove.equals("scissors"))
                || (playerMove.equals("paper") && computerMove.equals("rock"))
                || (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "Win";
        }

        return "Loss";
    }

    /**
     * Generates a random computer move.
     *
     * @return rock, paper, or scissors
     */
    static String getComputerMove() {
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();

        return moves[random.nextInt(moves.length)];
    }

    /**
     * Runs the game for the specified number of rounds.
     *
     * @param numberOfRounds number of rounds
     */
    static void playGame(int numberOfRounds) {
        Scanner scanner = new Scanner(System.in);

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int round = 1; round <= numberOfRounds; round++) {

            System.out.print("Round " + round
                    + " - Enter rock, paper, or scissors: ");

            String playerMove = scanner.nextLine().toLowerCase();

            String computerMove = getComputerMove();

            String result = playRound(playerMove, computerMove);

            System.out.println("Computer: " + computerMove);
            System.out.println("Result: " + result);

            if (result.equals("Win")) {
                wins++;
            } else if (result.equals("Loss")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println();
        }

        double winPercentage = (wins * 100.0) / numberOfRounds;

        System.out.println("===== Game Summary =====");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        scanner.close();
    }

    /**
     * Takes the number of rounds and starts the game.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rounds: ");
        int numberOfRounds = scanner.nextInt();
        scanner.nextLine();

        if (numberOfRounds <= 0) {
            System.out.println("Error: Number of rounds must be greater than 0.");
        } else {
            playGame(numberOfRounds);
        }

        scanner.close();
    }
}