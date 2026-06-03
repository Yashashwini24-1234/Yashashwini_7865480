import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {

                System.out.println("Calculator closed.");
                break;
            }

            System.out.print("Enter first number: ");
            double firstNumber = sc.nextDouble();

            System.out.print("Enter second number: ");
            double secondNumber = sc.nextDouble();

            double result;

            // Performing operations
            switch (choice) {

                case 1:

                    result = firstNumber + secondNumber;
                    System.out.println("Result = " + result);
                    break;

                case 2:

                    result = firstNumber - secondNumber;
                    System.out.println("Result = " + result);
                    break;

                case 3:

                    result = firstNumber * secondNumber;
                    System.out.println("Result = " + result);
                    break;

                case 4:

                    if (secondNumber != 0) {

                        result = firstNumber / secondNumber;
                        System.out.println("Result = " + result);
                    }

                    else {

                        System.out.println("Division by zero is not allowed.");
                    }

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (true);

        sc.close();
    }
}