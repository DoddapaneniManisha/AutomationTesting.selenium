import java.util.Random;
import java.util.Scanner;

public class Game{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Number of rounds to play
        int numRounds = 3;

        // Player and computer scores
        int playerWins = 0;
        int computerWins = 0;

        while (numRounds > 0) {

            // Get player name and choice
            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();

            System.out.println(playerName + ", choose (R, P, S): ");
            String playerChoice = scanner.nextLine().toUpperCase();
            validateChoice(playerChoice);

            // Generate computer's choice (thread for simultaneous choice, optional)
            String computerChoice = generateComputerChoice(random);

            // Determine winner and update scores
            int result = compareChoices(playerChoice, computerChoice);
            if (result == 1) {
                playerWins++;
                System.out.println(playerName + " wins!");
            } else if (result == 2) {
                computerWins++;
                System.out.println("Computer wins!");
            } else {
                System.out.println("Tie!");
            }

            // Display current score
            System.out.println("Current score: " + playerName + " - " + playerWins + ", Computer - " + computerWins);

            numRounds--; // Decrement remaining rounds
        }

        // Game over message and overall winner
        System.out.println("\nGame Over!");
        if (playerWins > computerWins) {
            System.out.println(playerName + " won the best of " + (3 * numRounds) + "!");
        } else if (computerWins > playerWins) {
            System.out.println("Computer won the best of " + (3 * numRounds) + "!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    private static void validateChoice(String choice) {
        if (!choice.equals("R") && !choice.equals("P") && !choice.equals("S")) {
            throw new IllegalArgumentException("Invalid choice. Please enter R, P, or S.");
        }
    }

    private static String generateComputerChoice(Random random) {
        // Add thread for simultaneous choice if desired
        String[] choices = {"R", "P", "S"};
        return choices[random.nextInt(choices.length)];
    }

    private static int compareChoices(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return 0; // Tie
        } else if ((playerChoice.equals("R") && computerChoice.equals("S")) ||
                (playerChoice.equals("P") && computerChoice.equals("R")) ||
                (playerChoice.equals("S") && computerChoice.equals("P"))) {
            return 1; // Player wins
        } else {
            return 2; // Computer wins
        }
    }
}