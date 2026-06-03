import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        // Generating random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        // Loop continues until correct guess
        do {

            System.out.print("\nEnter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess > secretNumber) {

                System.out.println("Too high! Try again.");
            }

            else if (userGuess < secretNumber) {

                System.out.println("Too low! Try again.");
            }

            else {

                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (userGuess != secretNumber);

        sc.close();
    }
}