import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {

        super(message);
    }
}

public class CustomExceptionExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Taking age input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Checking age condition
            if (age < 18) {

                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("You are eligible for Voting.");
        }

        catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        catch (Exception e) {

            System.out.println("Invalid input.");
        }

        sc.close();
    }
}