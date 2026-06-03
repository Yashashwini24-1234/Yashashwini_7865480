import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Taking number of entries
        System.out.print("Enter the number of students: ");
        int count = sc.nextInt();

        sc.nextLine();

        // Adding entries to HashMap
        for (int i = 1; i <= count; i++) {

            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            studentMap.put(id, name);
        }

        // Retrieving student name using ID
        System.out.print("\nEnter student ID to search: ");
        int searchId = sc.nextInt();

        // Checking and displaying result
        if (studentMap.containsKey(searchId)) {

            System.out.println("Student Name: " + studentMap.get(searchId));
        }

        else {

            System.out.println("Student ID not found.");
        }

        sc.close();
    }
}