import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnectionExample {

    public static void main(String[] args) {

        String url =
                "jdbc:mysql://localhost:3306/studentdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

        String username = "root";

        String password = "Yashashwini@1234";

        try {

            // Loading JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating connection
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully");

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM students";

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("\nStudent Details:");

            while (resultSet.next()) {

                int id = resultSet.getInt("id");

                String name = resultSet.getString("name");

                int age = resultSet.getInt("age");

                System.out.println(id + "  " + name + "  " + age);
            }

            resultSet.close();

            statement.close();

            connection.close();
        }

        catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}