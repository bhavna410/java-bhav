import java.sql.*; // import JDBC classes

class DatabaseConnectionDemo {
    public static void main(String[] args) {

        // Database URL, username, password
        String url = "jdbc:mysql://localhost:3306/testdb"; // replace 'testdb' with your database name
        String user = "root"; // database username
        String password = "password"; // database password

        try {
            // Load JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Database connected successfully!");
            } else {
                System.out.println("Failed to connect to database.");
            }

            // Close connection
            con.close();
        } 
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}