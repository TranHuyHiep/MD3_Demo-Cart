package ConnectionMySQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_MySql {
    public static Connection getConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/module3";
            String username = "root";
            String pass = "123123";
            return DriverManager.getConnection(url,username,pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
