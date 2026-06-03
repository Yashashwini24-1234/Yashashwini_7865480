import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        try {

            // Writing data to file
            FileWriter writer =
            new FileWriter(
                "D:/7865480/Solutions/Module_3/output.txt"
        );

            writer.write(text);

            writer.close();

            System.out.println("Data has been written to output.txt successfully.");
        }

        catch (IOException e) {

            System.out.println("An error occurred while writing to the file.");
        }

        sc.close();
    }
}