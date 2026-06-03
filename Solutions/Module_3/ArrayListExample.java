import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating ArrayList
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int count = sc.nextInt();

        sc.nextLine();

        // Adding names to ArrayList
        for (int i = 1; i <= count; i++) {

            System.out.print("Enter student name " + i + ": ");

            String name = sc.nextLine();

            studentNames.add(name);
        }

        // Displaying all names
        System.out.println("\nStudent Names:");

        for (String name : studentNames) {

            System.out.println(name);
        }

        sc.close();
    }
}