import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int firstNumber = sc.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = sc.nextInt();

            // Performing division
            int result = firstNumber / secondNumber;

            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {

            System.out.println("Division by zero is not allowed.");
        }

        catch (Exception e) {

            System.out.println("Invalid input.");
        }

        sc.close();
    }
}