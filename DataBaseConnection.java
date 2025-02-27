import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class DataBaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to database established successfully.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
        return connection;
    }
    
}

