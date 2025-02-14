import java.util.*;

public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalRounds = 0;
        int roundsWon = 0;

        while (true) {
            totalRounds++;
            System.out.println("Round" + totalRounds);
            System.out.println("I have generated a rondom number between 1 to 100.Can you guess it?");

            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;

            boolean isGuessesCorrectly = false;

            while (attempts < maxAttempts && !isGuessesCorrectly) {
                attempts++;
                System.out.println("Enter your guess(Attempt " + attempts + " of " + maxAttempts + "): ");
                int userGuess = sc.nextInt();

                if (userGuess == randomNumber) {
                    isGuessesCorrectly = true;
                    System.out.println("Congratulations! You guessed the number correctly.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you have used all attempts! The correct number was: " + randomNumber);
                }
            }

            if (isGuessesCorrectly) {
                roundsWon++;
            }

            System.out.println("Do you want to play another round? (yes/no): ");
            String playAgain = sc.next();

            if (playAgain.equalsIgnoreCase("No")) {
                break;
            }
        }

        System.out.println("Game over! You played " + totalRounds + " rounds and won " + roundsWon + " rounds. ");
        sc.close();
    }
}