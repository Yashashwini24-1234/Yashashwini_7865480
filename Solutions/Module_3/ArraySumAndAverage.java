import java.util.Scanner;

public class ArraySumAndAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        int sum = 0;

        // Reading array elements
        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();

            sum = sum + numbers[i];
        }

        // Calculating average
        double average = (double) sum / size;

        // Displaying results
        System.out.println("\nSum = " + sum);

        System.out.println("Average = " + average);

        sc.close();
    }
}