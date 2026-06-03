import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String reversedString = "";

        // Reversing the string using loop
        for (int i = text.length() - 1; i >= 0; i--) {

            reversedString = reversedString + text.charAt(i);
        }

        // Displaying reversed string
        System.out.println("Reversed string: " + reversedString);

        sc.close();
    }
}