
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author karthiksonti
 */
public class Database {
    
    private Connection conn;
    
    public Connection connect() throws Exception {
			
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/info";
                conn = DriverManager.getConnection(url, "root", "Admin@1234");
        } catch (ClassNotFoundException e) {
                throw new Exception(e);
        } 
        
        return conn;
    } 
    
    public void disconnect() {
        if(conn != null) {
                try {
                        conn.close();
                } catch (SQLException e) {
                        System.out.println("Can't close connection");
                }
        }
    }
    
}

