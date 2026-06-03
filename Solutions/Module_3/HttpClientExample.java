import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

    public static void main(String[] args) {

        try {

            // Creating HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Creating HttpRequest
            HttpRequest request =
                    HttpRequest.newBuilder()
                            .uri(URI.create("https://api.github.com/users/octocat"))
                            .GET()
                            .build();

            // Sending request and getting response
            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers.ofString()
                    );

            // Printing response status
            System.out.println("Status Code: "
                    + response.statusCode());

            // Printing response body
            System.out.println("\nResponse Body:\n");

            System.out.println(response.body());
        }

        catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}