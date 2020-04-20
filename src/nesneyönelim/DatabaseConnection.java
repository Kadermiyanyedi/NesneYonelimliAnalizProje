package nesneyönelim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static DatabaseConnection instance;
    private static Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/javadb";
    private String username = "kader";
    private String password = "elma123";
    
    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connection successful");
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }
    public static Connection getConnection() {
        return connection;
    }

    public static DatabaseConnection getInstance(){
    	try {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }
        return instance;
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return instance;
    }
}

