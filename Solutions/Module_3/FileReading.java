import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {

        try {

            // Opening file for reading
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;

            // Reading and displaying each line
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();
        }

        catch (IOException e) {

            System.out.println("An error occurred while reading the file.");
        }
    }
}