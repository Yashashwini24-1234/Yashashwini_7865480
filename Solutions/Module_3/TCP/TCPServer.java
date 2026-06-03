package TCP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {

        try {

            // Creating server socket
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server is waiting for client connection...");

            // Accepting client connection
            Socket socket = serverSocket.accept();

            System.out.println("Client connected.");

            // Input and output streams
            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );

            PrintWriter output =
                    new PrintWriter(socket.getOutputStream(), true);

            // Reading message from client
            String clientMessage = input.readLine();

            System.out.println("Client: " + clientMessage);

            // Sending response to client
            output.println("Hello from Server");

            // Closing resources
            input.close();

            output.close();

            socket.close();

            serverSocket.close();
        }

        catch (Exception e) {

            System.out.println("Server Error: " + e.getMessage());
        }
    }
}