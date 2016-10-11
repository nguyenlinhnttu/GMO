package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccess {
   private static Connection conn;
    // Connect SQLServer.
    public Connection getConnection() {
        // url connection
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName = QLSINHVIEN;user = sa;password = 123456;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
}
