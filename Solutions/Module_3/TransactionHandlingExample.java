import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class BankDAO {

    String url =
            "jdbc:mysql://localhost:3306/studentdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    String username = "root";

    String password = "Yashashwini@1234";

    // Method for money transfer
    void transferMoney(int senderId, int receiverId, double amount) {

        Connection connection = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection =
                    DriverManager.getConnection(url, username, password);

            // Starting transaction
            connection.setAutoCommit(false);

            // Checking sender balance
            String balanceQuery =
                    "SELECT balance FROM accounts WHERE id = ?";

            PreparedStatement balanceStatement =
                    connection.prepareStatement(balanceQuery);

            balanceStatement.setInt(1, senderId);

            ResultSet resultSet =
                    balanceStatement.executeQuery();

            double senderBalance = 0;

            if (resultSet.next()) {

                senderBalance = resultSet.getDouble("balance");
            }

            // Insufficient balance check
            if (senderBalance < amount) {

                System.out.println("Insufficient balance.");

                connection.rollback();

                return;
            }

            // Debit query
            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?";

            PreparedStatement debitStatement =
                    connection.prepareStatement(debitQuery);

            debitStatement.setDouble(1, amount);

            debitStatement.setInt(2, senderId);

            debitStatement.executeUpdate();

            // Credit query
            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            PreparedStatement creditStatement =
                    connection.prepareStatement(creditQuery);

            creditStatement.setDouble(1, amount);

            creditStatement.setInt(2, receiverId);

            creditStatement.executeUpdate();

            // Commit transaction
            connection.commit();

            System.out.println("\nTransaction completed successfully.");

            // Display updated balances
            String finalBalanceQuery =
                    "SELECT * FROM accounts WHERE id = ? OR id = ?";

            PreparedStatement finalStatement =
                    connection.prepareStatement(finalBalanceQuery);

            finalStatement.setInt(1, senderId);

            finalStatement.setInt(2, receiverId);

            ResultSet finalResult =
                    finalStatement.executeQuery();

            System.out.println("\nUpdated Account Balances:");

            while (finalResult.next()) {

                int id = finalResult.getInt("id");

                String name = finalResult.getString("name");

                double balance = finalResult.getDouble("balance");

                System.out.println(
                        "ID: " + id +
                                " | Name: " + name +
                                " | Balance: " + balance
                );
            }

            // Closing resources
            resultSet.close();

            finalResult.close();

            balanceStatement.close();

            debitStatement.close();

            creditStatement.close();

            finalStatement.close();

            connection.close();
        }

        catch (Exception e) {

            try {

                if (connection != null) {

                    connection.rollback();

                    System.out.println("Transaction rolled back.");
                }
            }

            catch (Exception ex) {

                System.out.println(ex.getMessage());
            }

            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class TransactionHandlingExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankDAO bankDAO = new BankDAO();

        // Taking input from user
        System.out.print("Enter Sender Account ID: ");
        int senderId = sc.nextInt();

        System.out.print("Enter Receiver Account ID: ");
        int receiverId = sc.nextInt();

        System.out.print("Enter Amount to Transfer: ");
        double amount = sc.nextDouble();

        // Calling transfer method
        bankDAO.transferMoney(senderId, receiverId, amount);

        sc.close();
    }
}