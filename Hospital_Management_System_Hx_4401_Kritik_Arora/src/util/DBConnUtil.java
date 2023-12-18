package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnUtil {
//    public static Connection getConnection(String connectionString) throws ClassNotFoundException {
    public static Connection getConnection() throws ClassNotFoundException {
        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(connectionString);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return connection;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/java_hx_4401";
			String username="root";
			String password="Kritik@123";
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
