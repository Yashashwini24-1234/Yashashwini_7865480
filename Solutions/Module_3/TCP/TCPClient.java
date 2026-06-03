package TCP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {

        try {

            // Connecting to server
            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to Server.");

            // Input and output streams
            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );

            PrintWriter output =
                    new PrintWriter(socket.getOutputStream(), true);

            // Sending message to server
            output.println("Hello from Client");

            // Reading response from server
            String serverMessage = input.readLine();

            System.out.println("Server: " + serverMessage);

            // Closing resources
            input.close();

            output.close();

            socket.close();
        }

        catch (Exception e) {

            System.out.println("Client Error: " + e.getMessage());
        }
    }
}