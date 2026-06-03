import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Removing non-alphanumeric characters
        // and converting to lowercase
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedString = "";

        // Reversing the string
        for (int i = text.length() - 1; i >= 0; i--) {

            reversedString = reversedString + text.charAt(i);
        }

        // Checking palindrome
        if (text.equals(reversedString)) {

            System.out.println("The string is a Palindrome");
        }

        else {

            System.out.println("The string is not a Palindrome");
        }

        sc.close();
    }
}