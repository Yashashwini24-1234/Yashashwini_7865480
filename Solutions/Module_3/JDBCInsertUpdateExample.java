import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class StudentDAO {

    String url =
            "jdbc:mysql://localhost:3306/studentdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    String username = "root";

    String password = "Yashashwini@1234";

    // Method to insert student record
    void insertStudent(int id, String name, int age) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            String query =
                    "INSERT INTO students(id, name, age) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            preparedStatement.setString(2, name);

            preparedStatement.setInt(3, age);

            int rows = preparedStatement.executeUpdate();

            System.out.println(rows + " record inserted successfully");

            preparedStatement.close();

            connection.close();
        }

        catch (Exception e) {

            System.out.println("Insert Error: " + e.getMessage());
        }
    }

    // Method to update student details
    void updateStudent(int id, String newName, int newAge) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            String query =
                    "UPDATE students SET name = ?, age = ? WHERE id = ?";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            preparedStatement.setString(1, newName);

            preparedStatement.setInt(2, newAge);

            preparedStatement.setInt(3, id);

            int rows = preparedStatement.executeUpdate();

            System.out.println(rows + " record updated successfully");

            preparedStatement.close();

            connection.close();
        }

        catch (Exception e) {

            System.out.println("Update Error: " + e.getMessage());
        }
    }
}

public class JDBCInsertUpdateExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO studentDAO = new StudentDAO();

        // Taking insert details from user
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        // Inserting record
        studentDAO.insertStudent(id, name, age);

        // Taking update details
        System.out.print("\nEnter ID to update: ");
        int updateId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter New Name: ");
        String newName = sc.nextLine();

        System.out.print("Enter New Age: ");
        int newAge = sc.nextInt();

        // Updating record
        studentDAO.updateStudent(updateId, newName, newAge);

        sc.close();
    }
}